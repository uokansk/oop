package oopSeminar1;

public class Product {
    private String name;
    private double coast;

    public Product(String name, double coast) {
        this.name = name;
        this.coast = coast;
    }

    public String getName() { return name; }

    public double getCoast() {
        return coast;
    }

    @Override
    public String toString() {
        return String.format("name = %s; coast = %1.2f", name,coast);
    }
}
