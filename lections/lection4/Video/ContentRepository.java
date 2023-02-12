package OOP_all.lections.lection4.Video;

import java.util.ArrayList;
import java.util.List;

public class ContentRepository<T extends Content> {

    private List<T> ds;

    public ContentRepository(){
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
   


    public List<T> getAll(){
        return this.ds;
    }
    
}
