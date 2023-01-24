package OOP_all.seminars.seminar2;

import java.util.List;

public class Senior extends Puple{

    private List<String> sublects;
    protected Senior(String name, String lastName, String familyName, int meanScore, int classNumber,List<String> sublects) {
        super(name, lastName, familyName, meanScore, classNumber);
        this.sublects = sublects;
    }

    @Override
    public void play() {
        System.out.println("Я играю в Dota");
        
    }

    @Override
    public void study() {
        System.out.println("Я должен учиться");
        
    }

    public List<String> getSubjects(){
        return this.sublects;
    }
    
}
