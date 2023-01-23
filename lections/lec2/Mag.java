public class Mag extends HeroBase{
    private int mana;
    private int maxMana;

    public Mag() {
        super(String.format("Hero_Magician #%d", ++Mag.number),
        Mag.r.nextInt(100, 200));
        this.maxMana = Mag.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d",super.getInfo(), this.mana);
    }

    @Override
    public void die() {
        System.out.println("Mag died");
        
    }
}
