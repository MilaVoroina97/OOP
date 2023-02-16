package OOP_all.lections.lec5.Task2.UI;

public class NewConsoleView extends ConsoleView{

    public NewConsoleView(){
        super();
    }

    @Override
    public void setDescription(String value){
        super.setDescription(value);
        System.out.println();
    }
    
}
