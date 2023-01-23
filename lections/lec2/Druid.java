public class Druid extends HeroBase{
    private int harmony;
    private int maxHarmony;

    public Druid() {
        super(String.format("Hero_Druid #%d", ++Druid.number),
        Mag.r.nextInt(100, 200));
        this.maxHarmony = Mag.r.nextInt(50, 150);
        this.harmony = maxHarmony;
    }

    public String getInfo() {
        return String.format("%s  Harmony: %d", super.getInfo(), this.harmony);
    }

    public void healing(HeroBase target) {
        int heal = HeroBase.r.nextInt(10, 20);
        if (this.harmony >= heal) {
            target.healed(heal);
        }
    }

    @Override
    public void die() {
        System.out.println("Druid died");
        
    }
}
