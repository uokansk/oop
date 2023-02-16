package oopSeminar1;

public class PerishableProduct extends Product {
    private int shelfLife;

    public PerishableProduct(String name, double coast, int shelfLife) {
        super(name, coast);
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString() {
        return String.format("%s; shelfLife = %d", super.toString(), shelfLife);
    }
}
