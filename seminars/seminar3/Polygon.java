package OOP_all.seminars.seminar3;

public abstract class Polygon extends Figure implements Perimetr{

    protected double[] sides;

    protected Polygon(double[] sides) throws IllegalArgumentException{
        this.sides = sides;

    }

    public double getPerimetr(){
        double perimetr = 0;

        for(double side : this.sides){
            perimetr += side;
        }

        return perimetr;
    }
    
}
