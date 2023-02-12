package OOP_all.lections.lection4.Video;

import java.util.ArrayList;
import java.util.List;

public class Repository{

    private List<Content> ds;
    public Repository(){
        this.ds = new ArrayList<>();
    }

    public List<Content>  get(){
        return ds;
    }

    public void merge (List<? extends Content> rep,List<? extends Content> rep1){
        
        for(int i =0; i< rep.size(); i++){

            ds.add(rep.get(i));

        }
        for(int i =0; i< rep1.size(); i++){

            ds.add(rep1.get(i));

        }


    }



}


    

