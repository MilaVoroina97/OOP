package OOP_all.lections.lec5.Task1;

public class Presenter {
    View v; 
    Model m;

    public Presenter(View v, Model m){

        this.v = v;
        this.m = m;
    }

    public void buttonClick(){
        int a = v.getValue("a: ");
        int b = v.getValue("b :");
        m.setX(a);
        m.setY(b);
        int result = m.result();
        v.printResult(result, "result: ");
    }


    
}
