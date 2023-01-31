package OOP_all.lections.lec3.ExBeverage;

public abstract class Ingredients {

    public String brand;
    
    public Ingredients(String brand){

        this.brand = brand;

    }

    @Override
    public String toString(){
        return brand;
    }

    @Override 
    public boolean equals(Object obj){
        Ingredients t = (Ingredients) obj;
        return this.brand==t.brand;
    }
    
}
