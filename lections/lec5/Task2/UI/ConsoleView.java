package OOP_all.lections.lec5.Task2.UI;

import OOP_all.lections.lec5.Task2.Core.MVP.View;
import java.util.Scanner;

public class ConsoleView implements View{

    Scanner sc;
    public ConsoleView(){
        sc = new Scanner(System.in);
    }

    @Override
    public String getFirstName() {
        System.out.println("FirstName : ");
        return sc.nextLine();
    }

    @Override
    public void setFirstName(String value) {
        System.out.printf("FirstName: %s\n", value);
        
    }

    @Override
    public String getLastName() {
        System.out.println("LastName : ");
        return sc.nextLine();
    }

    @Override
    public void setLastName(String value) {
        System.out.printf("LastName: %s\n", value);
        
    }

    @Override
    public String getDescription() {
        System.out.println("Description : ");
        return sc.nextLine();
    }

    @Override
    public void setDescription(String value) {
        System.out.printf("Description: %s\n", value);
        
    }

    @Override
    public String getNumber() {
        System.out.println("Number : ");
        return sc.nextLine();
    }

    @Override
    public void setNumber(String number) {
        System.out.printf("Number: %s\n", number);
        
    }
    
}
