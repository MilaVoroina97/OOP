package OOP_all.seminars.seminar2.seminar2_1;

public class JuniorStudent extends Student implements Player,Extender{

    private boolean isExtended;

    public JuniorStudent(String name, double mark, String numberClass,boolean isExtended) {
        super(name, mark, numberClass);
        this.isExtended = isExtended;
    }

    public JuniorStudent(String name, double mark, String numberClass){
        super(name, mark, numberClass);
        this.isExtended = false;
    }

    public boolean getIsExtended(){
        return this.isExtended;
    }

    @Override
    public void play() {
        System.out.println("Я играю");
        
    }

    @Override
    public void study() {
        System.out.println("Я учусь");
        
    }

    @Override
    public void extend() {
        boolean isLongSc = this.getIsExtended();
        if(isLongSc == true){
            System.out.println("Вы уже записаны в школу продленного дня");
        }else{
            System.out.printf("Ученик %s из класса %s записан\n",this.getName(),this.getClassNumber());

        }
        
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format(" Ходит ли в продленку : " + this.getIsExtended());
    }
}
