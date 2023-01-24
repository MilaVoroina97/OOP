package OOP_all.seminars.seminar2.seminar2_1;

import java.util.ArrayList;

public class SeniorStrudent extends Student implements Examer,Smoker{

    private ArrayList<String> subjects; 
    public SeniorStrudent(String name, double mark, String numberClass,ArrayList<String> subjects) {
        super(name, mark, numberClass);
        this.subjects = subjects;
    }

    public SeniorStrudent(String name, double mark, String numberClass){
        super(name, mark, numberClass);
        this.subjects = new ArrayList<>();
    }

    public ArrayList<String> getSubjects(){
        return this.subjects;
    }



    @Override
    public void passExam(String exam) {
        ArrayList<String> temp = this.subjects;
        temp.add(exam);
    }

    @Override
    public void study() {
        System.out.println("Я должен учиться");
        
    }

    @Override
    public void smoke() {
        System.out.println("Я бросаю курить");
        
    }

    @Override
    public String toString(){
        return String.format("%s Exams : %s",super.toString(),this.getSubjects());
    }
    
}
