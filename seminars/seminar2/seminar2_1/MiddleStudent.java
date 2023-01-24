package OOP_all.seminars.seminar2.seminar2_1;

public class MiddleStudent extends Student implements Player,Smoker{

    public MiddleStudent(String name, double mark, String numberClass) {
        super(name, mark, numberClass);
    }

    @Override
    public void smoke() {
        System.out.println("Я начинаю курить");
        
    }

    @Override
    public void play() {
        System.out.println("Я играю в Minecraft");
        
    }

    @Override
    public void study() {
       System.out.println("Ненавижу школу");
        
    }

    @Override
    public String toString(){
        return super.toString();
    }
    
}
