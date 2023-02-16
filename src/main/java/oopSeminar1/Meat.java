package oopSeminar1;

public class Meat extends Product{
    private String typeOfMeat;
    public Meat(String name, double coast) {
        super(name, coast);
    }

    public Meat(String name, double coast, String typeOfMeat) {
        super(name, coast);
        this.typeOfMeat = typeOfMeat;
    }
    @Override
    public String toString() {
        return String.format("%s; typeOfMeat = %s", super.toString(), typeOfMeat);
    }
}
