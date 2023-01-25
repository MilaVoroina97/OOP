package OOP_all.seminars.seminar2.seminarPlanet;

public class Sun implements Planet{
    private static Sun instance;
    private Sun(){};
    public static Sun getInstance(){
        if(instance == null) instance = new Sun();
        return instance;
    }

}
