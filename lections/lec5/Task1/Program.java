package OOP_all.lections.lec5.Task1;

public class Program {

    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View(), new SumModel());
        presenter.buttonClick();
    }
    
}
