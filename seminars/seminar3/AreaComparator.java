package OOP_all.seminars.seminar3;

import java.util.Comparator;

public class AreaComparator implements Comparator<Figure>{
    @Override
    public int compare(Figure o1, Figure o2) {
        return  Integer.compare(o1.getArea(), o2.getArea());
    }
    
}
