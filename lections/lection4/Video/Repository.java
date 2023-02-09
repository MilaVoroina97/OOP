package OOP_all.lections.lection4.Video;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import OOP_all.seminars.seminar2.seminarPlanet.P;

public class Repository <T extends Content> {

    List<T> ds;
    private String name;
    public Repository(String name){
        this.name = name;
        this.ds = new ArrayList<>();
    }

    public void addElem(T content){
        ds.add(content);

    }

    public T get(Integer index){
        return ds.get(index);
    }

    public int count(){
        return ds.size();
    }
    @SuppressWarnings("unchecked")
    public void merge (Repository<? extends Content> rep){

        Repository<T> temp = (Repository<T>) rep;
        for(int i = 0; i < temp.count(); i++){
            if(temp.get(i) == null) System.out.println("null");;
            this.addElem(temp.get(i));
        }
    }



}


    

