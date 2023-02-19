package OOP_all.lections.lec6.Ex2;

public class SiverClient extends BaseClient{

    @Override
    public double getDiscount(double price){
        // return price * 0.9;
        return super.getDiscount(price) * 0.9;
    }
    
}
