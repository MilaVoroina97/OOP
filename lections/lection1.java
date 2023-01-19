package OOP_all.lections;

import java.util.Arrays;

public class lection1 {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2,3);
        // Point2D a = new Point2D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        Point2D b = new Point2D(4,5,6);
        System.out.println(b.getX());
        System.out.println(b.getY());
        System.out.println(b.getZ());
        // Point2D b = new Point2D(0, 10);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);

        PointND c = new PointND(Arrays.asList(7,8,9,10));
        PointND d = new PointND(Arrays.asList(1,2,3,4));
        var dis1 = PointND.distance2(c, d);
        System.out.println(dis1);

    }
}
