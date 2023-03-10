package OOP_all.seminars.seminar3;

public class Rectangle extends Polygon{

    public Rectangle(double length, double width) {
        super(new double[]{length,width,length,width});
    }

    @Override
    public int getArea() {
        return (int) (this.sides[0] * this.sides[1]);
    }

    public String getName(){
        return "Rectangle";
    }
    
}
