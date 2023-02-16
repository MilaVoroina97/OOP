package OOP_all.lections.lec5.Task2.UI;

import java.util.Scanner;

import OOP_all.lections.lec5.Task2.Config;
import OOP_all.lections.lec5.Task2.Core.MVP.Presenter;
import OOP_all.lections.lec5.Task2.Core.MVP.View;


public class App {

    public static void ButtonClick(){
        System.out.print("\033[H\033[J");
        View view = new NewConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();
        try(Scanner in = new Scanner(System.in)){
            while(true){
                System.out.println("1 - prev; 2 - next");
                String key = in.nextLine();
                System.out.print("\033[H\033[J");
                switch(key){
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    default:
                    System.out.println("There is not such command");
                    break;
                }
            }
        }

    }
    
}
