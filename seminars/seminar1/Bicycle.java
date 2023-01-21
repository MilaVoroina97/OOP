package OOP_all.seminars.seminar1;

public class Bicycle extends Transport{

    protected Bicycle(String color,String model,int wheels,int weight,int speed){
        super(color,model,wheels,weight,speed);
        this.type = "Bicycle";
    }
    // @Override
    // protected void drive(){
    //     System.out.printf("This bicycle %s is going with speed %d \n",this.getModel(),this.getSpeed());
    // }
}
