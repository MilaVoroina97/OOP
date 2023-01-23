public class Priests extends HeroBase{
    private int elixir;
    private int maxElixir;

    public Priests() {
        super(String.format("Hero_Priest #%d", ++Priests.number),
        Priests.r.nextInt(100, 200));
        this.maxElixir = Priests.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }
    
    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
    
    public void attack(HeroBase target) {
        int damage = HeroBase.r.nextInt(10, 20);
        target.GetDamage(damage);
    }

    @Override
    public void die() {
        System.out.println("Priest died");
        
    }
}
