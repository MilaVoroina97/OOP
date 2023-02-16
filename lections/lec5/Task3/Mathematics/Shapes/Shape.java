package OOP_all.lections.lec5.Task3.Mathematics.Shapes;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {

    protected double area; 
    protected String name;

    public double getArea(){
        return area;
    }

    protected void setArea(double value){

        area = value;
    }

    protected void setName(String value){
        name = value;
    }

    public String getName(){
        return name;
    }

    public List<Shape> shapes = new ArrayList<>();
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        printShape(sb, "");
        return sb.toString();
    }

    private void printShape(StringBuilder sb, String indent){

        sb.append(String.format("%s %s %f\n", indent, name, getArea()));
        for(Shape shape : shapes){
            shape.printShape(sb, indent + " ");
        }

    }


    
}
