package OOP_all.seminars.seminar1;

public class Motobike extends Transport{

    protected Motobike(String color,String model,int wheels,int weight,int speed){
        super(color,model,wheels,weight,speed);
        this.type = "Motobike";
    }
    // @Override
    // protected void drive(){
    //     System.out.printf("This motobike %s is going with speed %d \n",this.getModel(),this.getSpeed());
    // }
}
