package OOP_all.lections.lection4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(1,2,3,4));

        // var el = Methods.getElementFromUCollection(data, 0);
        // System.out.println(el);
        var el = Methods.<Integer>getElementFromUCollection(data, 0);
        System.out.println(el);


    }
    
}
