package OOP_all.lections.lec6.Ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(Arrays.asList(new Dog(), new Python()));
        for(var animal : animals){
            System.out.println(animal.getType());
        }

        List<Legs> legs = new ArrayList<>(Arrays.asList(new Dog()/* , new Python() */));
        for(var leg : legs){
            System.out.println(leg.getLegsCount());
        }


        
    }
}
