package oopSeminar1;

public class Сhocolate extends Product{
    public Сhocolate(String name, double coast) {
        super(name, coast);
    }
    private int weight = 0;

    public Сhocolate(String name, double coast, int weight) {
        super(name, coast);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s; weight = %d", super.toString(), weight);
    }
}
