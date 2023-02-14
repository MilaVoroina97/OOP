package OOP_all.lections.lec5.Task1;

import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);
    public int getValue(String title){

        System.out.printf("%s",title);
        return sc.nextInt();

    }

    public void printResult(int result, String title){
        System.out.printf("%s %d\n",title,result);
    }
}
