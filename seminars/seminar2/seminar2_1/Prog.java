package OOP_all.seminars.seminar2.seminar2_1;

public class Prog {

    public static void showInfo(Student s){
        if(s instanceof Player)((Player) s).play();
        if(s instanceof Smoker) ((Smoker) s).smoke();
        if(s instanceof Extender) ((Extender) s).extend();
        if(s instanceof Examer) {
            ((Examer) s).passExam("Maths");
            ((Examer) s).passExam("English");
            ((Examer) s).passExam("Physics");
        }
        s.study();
        System.out.println(s);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new JuniorStudent("Ivan",5,"1 A");
        Student s2 = new MiddleStudent("Roman",4,"2 B");
        Student s3 = new SeniorStrudent("Pavel",3,"5 D");
        Student[] all = new Student[]{s1,s2,s3};
        for(Student stud : all){
            showInfo(stud);
        }
    }
    
}
