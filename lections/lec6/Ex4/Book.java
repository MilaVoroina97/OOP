package OOP_all.lections.lec6.Ex4;

public class Book {

    View view;

    public void setView(View view){
        this.view = view;
    }

    int index;
    public Book(View view){

        this.view = view;
        index = 1;
    }


    public void viewTitle(){
        view.print("Title");
    }

    public void viewCurrentPage(){
        view.print(String.format("Page %d",index));
    }
    
}
