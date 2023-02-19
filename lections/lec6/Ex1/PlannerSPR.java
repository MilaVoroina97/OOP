package OOP_all.lections.lec6.Ex1;

import java.util.ArrayList;
import java.util.List;

public class PlannerSPR {

    List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        entries.add(text);
    }
    public void removeEntry(int index) {
        entries.remove(index);
    }
    @Override
    public String toString() {
        return String.join("\n", entries);
    }  
     
}
