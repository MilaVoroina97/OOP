package OOP_all.lections.lec6.Ex3;

public class Dog extends Animal implements Legs{

    @Override
    public String getType() {
        return "собачка";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
    
}
