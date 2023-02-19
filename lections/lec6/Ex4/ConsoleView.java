package OOP_all.lections.lec6.Ex4;

public class ConsoleView implements View{

    @Override
    public void print(String text) {
        String result = String.format("ConsoleViewDIP %s", text);
        System.out.println(result);
        
    }
    
}
