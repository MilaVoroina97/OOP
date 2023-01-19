package OOP_all.lections.lec1;

public class Doctor extends BaseHero{

    private int getHealth;
    private int getMaxHealth;

    public Doctor(){
        super(String.format("Hero_Doctor #%d", ++Doctor.number),
        Doctor.r.nextInt(100,200));
        this.getMaxHealth = Doctor.r.nextInt(50,150);
        this.getHealth = getMaxHealth;
    }
    public String getInfo() {
        return String.format("%s  GetHeath: %d", super.getInfo(), this.getHealth);
    
    }

    // public void giveHealth(int health){
    //     if(this.hp + health <= this.maxHp && health <=this.getMaxHealth){
    //         this.hp += health;
    //     }
    // } 

    public void Recover(BaseHero hero3){
        int health = BaseHero.r.nextInt(10, 50);
        System.out.println(health);
        if(health <= getMaxHealth){
            hero3.hp += health;
        }
    }

}
