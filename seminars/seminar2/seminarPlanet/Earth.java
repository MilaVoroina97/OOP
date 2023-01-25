package OOP_all.seminars.seminar2.seminarPlanet;

public class Earth implements Planet{

    private static Earth instance;
    private Earth(){};
    public static Earth getInstance(){
        if(instance == null) instance = new Earth();
        return instance;
    }
}
