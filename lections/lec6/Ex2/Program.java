package OOP_all.lections.lec6.Ex2;

public class Program {

    public static void main(String[] args) {
        System.out.println(new BaseClient().getDiscount(100));
        System.out.println(new SiverClient().getDiscount(100));
        System.out.println(new VIPCLient().getDiscount(100));

    }
    
}
