package OOP_all.lections;

import java.util.List;
import java.util.Scanner;

public class PointND {

    private List<Integer> firstPoint;
   

    public PointND(List<Integer> first){
        firstPoint = first;
    }

    public  int getPoints(int point){
        return firstPoint.get(point);
    }


    public void setPoints(){
        
        System.out.println("Enter number of position to find a point: ");
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        System.out.println("Enter the value you want to set : ");
        int setPoint = sc.nextInt();

            for(int i = 0 ; i < firstPoint.size(); i++){
                if(i == point){
                    firstPoint.set(point, setPoint);
                }else{
                    System.out.println("There is not such point");
                }
            }
        sc.close();
    }

    public static double distance2(PointND a, PointND b) {
        double result = 0;
        for(int i = 0; i < a.firstPoint.size(); i++){
            
                result += Math.sqrt(Math.pow(b.getPoints(i) - a.getPoints(i), 2));
                System.out.println("a : " + b.getPoints(i));
                System.out.println("b : " + a.getPoints(i));
            }

        
        return result;
    }
}
