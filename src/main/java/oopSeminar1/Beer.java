package oopSeminar1;

public class Beer extends Product {

    private int alcohol = 0;
    public Beer(String name, double coast) {
        super(name, coast);
    }

    public Beer(String name, double coast, int alcohol) {
        this(name, coast);
        this.alcohol = alcohol;
    }

    @Override
    public String toString() {
        return String.format("%s; alcohol = %d", super.toString(), alcohol);
    }
}
