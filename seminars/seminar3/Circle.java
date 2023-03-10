package OOP_all.seminars.seminar3;

public final class Circle extends Figure implements CircleLenght{

    private double radius;

    public Circle(double radius){

        if(radius < 0) throw new IllegalArgumentException("Radius cannot be negative");
        this.radius = radius;
    }
    @Override
    public double getCircleLenght() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public int getArea() {

        return (int) (Math.PI * Math.pow(this.radius,2));
    }

    public String getName(){
        return "Circle";
    }
    
}
