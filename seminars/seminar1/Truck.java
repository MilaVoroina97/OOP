package OOP_all.seminars.seminar1;

public class Truck extends Transport{

    protected Truck(String color,String model,int wheels,int weight,int speed){
        super(color,model,wheels,weight,speed);
        this.type = "Truck";
    }
    // @Override
    // protected void drive(){
    //     System.out.printf("This truck %s is going with speed %d \n",this.getModel(),this.getSpeed());
    // }
}
