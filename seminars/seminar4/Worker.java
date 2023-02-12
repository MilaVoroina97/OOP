package OOP_all.seminars.seminar4;

public class Worker {

    private int ID;
    private String name;


    public Worker(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void setId(int id){
        this.ID = id;
    }

    public int getId(){
        return this.ID;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return String.format("Worker id : %d name : %s ",this.getId(),this.getName());
    }

    
}
