package oopSeminar4;

public class Footman extends BaseHero<WoodShield, GoldShield> {

    public Footman(int health, String name, WoodShield weapon) {
        super(health, name, weapon);
    }

    public Footman(int health, String name, WoodShield weapon, GoldShield shield) {
        super(health, name, weapon, shield);
    }

    @Override
    public String toString() {
        return "Footman{" +
                "} " + super.toString() + "\n" +  "~~~";
    }
}
