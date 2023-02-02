package OOP_all.seminars.seminar3;

public class Triangle extends Polygon{

    private Triangle(double length,double width,double height) {
        super(new double[]{length,width,height});

        // if(length + width > height && width + height > length && length + height > width)
    }

    public static Triangle newBuilder(double length,double width,double height){
        if(length + width < height || width + height < length || length + height < width || length < 0){
            throw new IllegalArgumentException("Sides is not valid!");
            // return null;
        }

        return new Triangle(length, width, height);
    }


    @Override
    public double getArea() {
        double polyPerimetr = (this.sides[0] + this.sides[1] + this.sides[2])/2;
        double res = Math.sqrt(polyPerimetr * (polyPerimetr - this.sides[0])*(polyPerimetr - this.sides[1])*(polyPerimetr - this.sides[1]));
        return res;
    }

    public String getName(){
        return "Triangle";
    }
    
}
