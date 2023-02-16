package OOP_all.lections.lec5.Task3.Mathematics.Shapes;

public class Circle extends Shape{

    public double radius;

    public static Circle create(double radius, String name){

        if(radius < 0)
            System.out.println("radius cannot be negative");
        var instance = new Circle();
        instance.name = name;
        instance.radius = radius;
        return instance;
    }

    private Circle(){

    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }


    
}
