package OOP_all.lections.lec6.Ex4;

public class WindowView implements View{

    @Override
    public void print(String text) {
        String result = String.format("WinFormViewDIP %s", text);
        System.out.println(result);
        
    }
    
}
