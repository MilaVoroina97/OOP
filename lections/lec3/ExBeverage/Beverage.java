package OOP_all.lections.lec3.ExBeverage;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage
        implements Iterable<Ingredients> {
    public List<Ingredients> components;
    int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredients component) {

        if (!(components.indexOf(component) != -1))
            components.add(component);
    }

}
