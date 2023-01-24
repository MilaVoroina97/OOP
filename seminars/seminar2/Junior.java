package OOP_all.seminars.seminar2;

public class Junior extends Puple{


    private boolean isLongSc;
    protected Junior(String name, String lastName, String familyName, int meanScore, int classNumber,boolean isLongSc) {
        super(name, lastName, familyName, meanScore, classNumber);
        this.isLongSc = isLongSc;
    }

    public boolean getIsLongSc(){
        return this.isLongSc;
    }

    
    @Override
    public void play() {
        System.out.println("Я играю в игрушки");
    }

    @Override
    public void study() {
       System.out.println("Я люблю школу");
    }

    public void recordInLongSc(boolean isLongSc){
        if(isLongSc == true){
            System.out.println("Вы уже записаны в школу продленного дня");
        }else{
            System.out.printf("Ученик %s %s %s из класса %d записан",this.getName(),this.getLastName(),this.getFamilyName(),
            this.getClassNumber());

        }
    }


    
}
