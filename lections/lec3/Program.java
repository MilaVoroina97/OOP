package OOP_all.lections.lec3;

import java.util.ArrayList;
// import java.util.Iterator;
import java.util.List;
import java.util.Random;

// import OOP_all.lections.lec3.ExBeverage.Beans;
// import OOP_all.lections.lec3.ExBeverage.Beverage;
// import OOP_all.lections.lec3.ExBeverage.Coffee;
// import OOP_all.lections.lec3.ExBeverage.Ingredients;
// import OOP_all.lections.lec3.ExBeverage.Milk;
// import OOP_all.lections.lec3.ExBeverage.Water;

public class Program {

    public static void main(String[] args) {
        // Worker worker = new Worker("Имя", "Фамилия", 23, 4567);
        // Iterator<String> components = worker;
        // while(components.hasNext()){
        //     System.out.println(worker.next());
        // }


        // Beverage coffee = new Coffee();
        // coffee.addComponent(new Milk("Moloko"));
        // coffee.addComponent(new Water("Water"));
        // coffee.addComponent(new Beans("Beans"));

        // Iterator<Ingredients> iterator = coffee;
        // while(iterator.hasNext()){
        //     System.out.println(iterator.next());
        // }

        Random r = new Random();
        List<Worker1> worker1 = new ArrayList<>();
        for(int i = 0 ; i < 5; i++){
            worker1.add(new Worker1("Name " + i, "Lastname " + i, r.nextInt(18,50), r.nextInt(10000,30000)));
        }

        System.out.println(worker1);
        worker1.sort(new SalaryComparator());
        System.out.println(worker1);
        worker1.sort((w1,w2)->Integer.compare(w1.age,w2.age));
        System.out.println(worker1);

    }

}
