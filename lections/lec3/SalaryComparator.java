package OOP_all.lections.lec3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Worker1>{

    @Override
    public int compare(Worker1 o1, Worker1 o2) {
        return Integer.compare(o1.salary,o2.salary);
    }
    
}
