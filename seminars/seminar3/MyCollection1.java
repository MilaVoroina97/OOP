package OOP_all.seminars.seminar3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyCollection1 implements Comparator<Figure>{

    public static List<Figure> figures = new ArrayList<>(10);
    private static int size = 0;

    public static void add(Figure fig){
        figures.set(size, fig);
        size++;
        if(size == figures.size()){
            List<Figure> newFigures = new ArrayList<>(figures.size()*2);
            for(int i = 0; i < figures.size();i++){
                newFigures.set(i, figures.get(i));
            }

            figures = newFigures;
        }
    }

    public static void remove(int index){

        if(index >=0 && index <size){
            
            for(int i = index; i <size -1 ; i++){
                figures.set(i, figures.get(i+1));
            }
            size--;
        }
    }

    public static void remove(Figure fig){
        int index = -1;
        for(int i = 0; i < size; i++){
            if(fig.equals(figures.get(i))){
                index = i;
                break;
            }
        }

        if(index != -1){
            remove(index);
        }
    }

    public int getSize(){
        return size;
    }

    public  static Figure getFigure(int index){
        if(index >=0 && index<size){
            return figures.get(index);
        }else return null;
    }

    public static void getAllInfo() {
        for(Figure fig : figures){
            if(fig instanceof Perimetr){
                System.out.printf("Perimetr %s : ",fig.getName());
                System.out.println(((Perimetr)fig).getPerimetr());
            } 
            if(fig instanceof Circle){

                System.out.printf("Circle length %s: ",fig.getName() );
                System.out.println(((Circle)fig).getCircleLenght());
            }

            System.out.printf("Area %s : ", fig.getName());
            System.out.println(fig.getArea());
        }
    }

    public static void replaceFig(int index,Figure newFig){

        for(int i = 0; i < size; i++){
            if(i == index){
                figures.set(index, newFig);
                break;
            }else System.out.println("There is not such index");
        }

    }

    public static void replaceFig(Figure oldVal,Figure newVal){
        if(oldVal == null){
            for(int i = 0; i < size; i++){
                if(figures.get(i) == null){
                    figures.set(i, newVal);
                    break;
                }
            }
        }else{
            for(int i = 0; i < size; i++){
                if(oldVal.equals(figures.get(i))){
                    figures.set(i, newVal);
                    break;
                }
            }
        }
    }

    @Override
    public int compare(Figure o1, Figure o2) {
        return Integer.compare(o1.getArea(), o2.getArea());
    }









    
}
