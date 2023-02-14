package OOP_all.lections.lec5.Task1;

public class SumModel extends CalcModel{

    @Override
    public int result() {
        return this.x + this.y;
    }

    @Override
    public void setX(int value) {
        this.x = value;
        
    }

    @Override
    public void setY(int value) {
        this.y = value;
        
    }
    
}
