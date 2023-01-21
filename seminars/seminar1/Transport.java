package OOP_all.seminars.seminar1;

public class Transport {
    private String color;
    private String model;
    private int wheels;
    private int weight;
    private int speed;
    protected String type;

    protected Transport(String color,String model,int wheels,int weight,int speed){
        this.color = color;
        this.model = model;
        this.wheels = wheels;
        this.weight = weight;
        this.speed = speed;
    }

    protected Transport(){
        this("Black","BMV",100,300,150);
    }

    protected String getColor(){
        return this.color;
    }

    protected void setColor(String color){
        this.color = color;
    }

    protected String getModel(){
        return this.model;
    }

    protected void setModel(String model){
        this.model = model;
    }

    protected int getWheels(){
        return this.wheels;
    }

    protected void setWheels(int wheels){
        this.wheels = wheels;
    }

    protected int getWeight(){
        return this.weight;
    }

    protected void setWeight(int weight){
        this.weight = weight;
    }

    protected int getSpeed(){
        return this.speed;
    }

    protected void setSpeed(int speed){
        this.speed = speed;
    }

    protected String getType(){
        return this.type;
    }

    protected void drive(){
        if(this.type == null){
            System.out.println("All transports can drive");
        }else {
            System.out.printf("The %s %s is going with speed %d\n",this.getType(), this.getModel(), this.getSpeed() );
        }
        
    }

    @Override
    public String toString(){
        return String.format("Type : %s , Model %s : , Color %s :", this.type, this.model, this.color);
    }

}
