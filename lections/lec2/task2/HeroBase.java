package task2;

public class HeroBase {

    int hp;
    public HeroBase(String name, int hp) {
        System.out.println("Вызван BaseHero(String name, int hp)");
        this.hp = hp;
    }

    public HeroBase() {
        this("", 0);
        System.out.println("Вызван BaseHero()");
    }
}
