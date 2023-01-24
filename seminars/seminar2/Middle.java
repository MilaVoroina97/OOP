package OOP_all.seminars.seminar2;

public class Middle extends Puple{

    public Middle(String name, String lastName, String familyName, int meanScore, int classNumber) {
        super(name, lastName, familyName, meanScore, classNumber);
    }

    @Override
    public void play() {
        System.out.println("Я играю в Minecraft");
        
    }

    @Override
    public void study() {
       System.out.println("Ненавижу школу");
        
    }
    
}
