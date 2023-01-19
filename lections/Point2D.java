package OOP_all.lections;

public class Point2D {
    private int x, y, z; // Это координата х и у

    /**
     * Это конструктор ...
     * @param valueX это координата Х
     * @param valueY это координата Y
     */
    public Point2D(int valueX, int valueY, int valueZ) {
        x = valueX;
        y = valueY;
        z = valueZ;
    }

    public Point2D(int value) {
        this(value, value,value);
    }
    public Point2D() {
        this(0);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }
    
    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    public void setZ(int value){
        this.z = value;
    }

    
    private String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }
    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2) + (Math.pow(a.getZ() - b.getZ(), 2))) ;
    }

}
