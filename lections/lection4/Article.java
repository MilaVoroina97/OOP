package OOP_all.lections.lection4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Article {

    public static <T extends Comparable<T>> T max(Collection<T> col){
        T candidate = col.iterator().next();
        for(T elem : col){
            if(candidate.compareTo(elem) < 0) candidate = elem;
        }

        return candidate;
    }

    public static <E> void main(String[] args) {

        List<Integer> ints = new ArrayList<Integer>();
        Class<? extends List> k = ints.getClass();
        assert k == ArrayList.class;
        
    }
    
}
