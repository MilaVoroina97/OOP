package OOP_all.lections.lec6.Ex2;

public class VIPCLient extends SiverClient{

    @Override
    public double getDiscount(double price){
        return super.getDiscount(price) * 0.9;
    }
}
