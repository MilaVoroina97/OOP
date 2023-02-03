package OOP_all.seminars.seminar3;
public class MyCollection implements Comparable<Figure>{
    public static Figure[] figures = new Figure[10];
    public static int size = 0;

    public static void add(Figure fig){
        figures[size] = fig;
        size++;
        if(size == figures.length){
            Figure[] newFigures = new Figure[figures.length*2];
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

    public static void getAllInfo(){
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

    @Override
    public int compareTo(Figure o) {
        // TODO Auto-generated method stub
        return 0;
    }




} 
