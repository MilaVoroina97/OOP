package OOP_all.lections.lec5.Task1;

public class PresenterOfT<T extends CalcModel>{

    View view;
    Model model;

    public PresenterOfT(T m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.printResult(result, "Sum: ");
    }
    
}
