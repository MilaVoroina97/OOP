package OOP_all.lections.lec3.ExBeverage;

import java.util.Iterator;

public class Coffee extends Beverage {

    @Override
    public Iterator<Ingredients> iterator() {

        Iterator<Ingredients> it = new Iterator<Ingredients>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Ingredients next() {
                return components.get(index++);
            }

        };
        return it;

    }

}