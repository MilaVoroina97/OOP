package OOP_all.seminars.seminar3;

import java.util.Arrays;
import java.util.Comparator;

public class MyCollection{
    private static Figure[] figures;
    private static int size;

    public MyCollection(Figure[] figures){

        MyCollection.figures = figures;
        MyCollection.size = figures.length;
        

    }

    public static void add(Figure fig){
        figures[size] = fig;
        size++;
        if(size == figures.length){
            Figure[] newFigures = new Figure[figures.length+1];
            for(int i = 0; i < figures.length;i++){
                newFigures[i]= figures[i];
            }

            figures = newFigures;
        }

    }

    public static void remove(int index){

        if(index >=0 && index <size){
            
            for(int i = index; i <size -1 ; i++){
                figures[i] = figures[i+1];
            }
            size--;
        }
    }

    public static void remove(Figure fig){
        int index = -1;
        for(int i = 0; i < size; i++){
            if(fig.equals(figures[i])){
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

    public static Figure getFigure(int index){
        if(index >=0 && index<size){
            return figures[index];
        }else return null;
    }

    public static void getAllInfo() {
        for(Figure fig : figures){
            if(fig instanceof Perimetr){
                System.out.printf("Perimetr %s : ",fig.getClass().getSimpleName());
                System.out.println(((Perimetr)fig).getPerimetr());
            } 
            if(fig instanceof Circle){

                System.out.printf("Circle length %s: ",fig.getClass().getSimpleName() );
                System.out.println(((Circle)fig).getCircleLenght());
            }

            System.out.printf("Area %s : ", fig.getClass().getSimpleName());
            System.out.println(fig.getArea());
        }
    }

    public static void replaceFig(int index,Figure newFig){

        for(int i = 0; i < size; i++){
            if(i == index){
                figures[i] = newFig;
                break;
            }
        }

    }

    public static void replaceFig(Figure oldVal,Figure newVal){
        if(oldVal == null){
            for(int i = 0; i < size; i++){
                if(figures[i] == null){
                    figures[i] = newVal;
                    break;
                }
            }
        }else{
            for(int i = 0; i < size; i++){
                if(oldVal.equals(figures[i])){
                    figures[i] = newVal;
                    break;
                }
            }
        }
    }

    // public static void sortFig(){
    //     List<Figure> newFig = new ArrayList<>(Arrays.asList(figures));
    //     for(int i = 0 ; i < newFig.size(); i++){

    //     }
    // }

    public static void sortFig(){
        Arrays.sort(figures,new Comparator<Figure>() {

            @Override
            public int compare(Figure o1, Figure o2) {
               if(o1.getArea() == o2.getArea()) return 0;
               else if(o1.getArea() > o2.getArea()) return 1;
               else return -1;

            }
            
        });

        for(int i =0; i < size; i++){
            System.out.println(figures[i].getArea());
        }

   
    }


    public static Comparator<Figure> COMPARE_BY_AREA = new Comparator<Figure>() {

        @Override
        public int compare(Figure o1, Figure o2) {
            return Integer.compare(o1.getArea(), o2.getArea());
        }
        
    };





} 
