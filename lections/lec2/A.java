public class A implements Interface_AB{

    public static void main(String[] args) {
        new A().printText();
    }

    @Override
    public void printText(){
        Interface_AB.super.printText();
    }
}

interface Interface_A{
    default void printText(){
        System.out.println("Interface A");
    }
}

interface Interface_B{

    default void printText(){
        System.out.println("Interface B");
    }
    
}

interface Interface_AB extends Interface_A, Interface_B{
    
    default void printText() {
        Interface_A.super.printText();
        Interface_B.super.printText();
        System.out.println("Interface AB");
    }
}
