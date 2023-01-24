package OOP_all.seminars.seminar2.seminar2_1;

public abstract class Student {
    private String name;
    private double mark;
    private String numberClass;

    protected Student(String name,double mark,String numberClass){
        this.name = name;
        this.mark = mark;
        this.numberClass = numberClass;
    }

    public String getName(){
        return this.name;
    }

    public String getClassNumber(){
        return this.numberClass;
    }

    public double getMark(){
        return this.mark;
    }

    public abstract void study();

    @Override
    public String toString(){
        return String.format("Student : %s, mark : %f , class : %s", this.getName(),this.getMark(),this.getClassNumber());
    }

}

