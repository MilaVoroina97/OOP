package OOP_all.seminars.seminar1;

public class Car extends Transport{

    protected Car(String color,String model,int wheels,int weight,int speed){
        super(color,model,wheels,weight,speed);
        this.type = "Car";
    }
    
    // @Override
    // protected void drive(){
    //     System.out.printf("This car %s is going with speed %d \n",this.getModel(),this.getSpeed());
    // }
}
