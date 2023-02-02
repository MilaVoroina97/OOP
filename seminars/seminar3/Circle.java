package OOP_all.seminars.seminar3;

public class Circle extends Figure implements CircleLenght{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getCircleLenght() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {

        return Math.PI * Math.pow(this.radius,2);
    }

    public String getName(){
        return "Circle";
    }
    
}
