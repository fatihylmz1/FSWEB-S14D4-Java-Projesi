package Monster;

public class Troll extends Monster{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @java.lang.Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @java.lang.Override
    public double poison() {
        return getDamage()*0.3;
    }
}
