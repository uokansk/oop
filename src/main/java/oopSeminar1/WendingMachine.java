package oopSeminar1;

import java.util.ArrayList;
import java.util.List;

public class WendingMachine {


    public double getMoney() {
        return money;
    }

    private double money =0.0;
    public List<Product> getProduct() {
        return product;
    }

    private List<Product> product = new ArrayList<>();


    public WendingMachine addProduct(Product product) {
        this.product.add(product);
        return this;

    }

    public Product findProduct(String name){
        for (Product prod: getProduct()) {
            if (prod.getName().equals(name)){
                return prod;
            }
        }
        return null;
    }
    public Product buy(String name, double coast){
        Product buyProduct = findProduct(name);
        if (buyProduct== null) return null;
        if (coast == buyProduct.getCoast()){
            product.remove(buyProduct);
            money += coast;
            return buyProduct;
        }
        return null;
    }
//    public void printList(){
//        for (Product prod : getProduct()) {
//            System.out.println(prod);
//        }
//    }

    @Override
    public String toString() {
        StringBuilder wdProduct = new StringBuilder();
        for (Product prod : getProduct()) {
            wdProduct.append(prod.toString());
            wdProduct.append('\n');
//            System.out.println(prod);
        }
        wdProduct.append(money);
        return wdProduct.toString();
    }



}
