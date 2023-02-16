package oopSeminar1;


public class Main {
    public static void main(String[] args) {
        WendingMachine store = new WendingMachine();
        store.addProduct(new Product("Lays", 123.25))
                .addProduct(new Product("fanta", 11.33))
                .addProduct(new Product("cola", 13.33))
                .addProduct(new Product("sprite", 15.33))
                .addProduct(new Product("water", 17.33))
                .addProduct(new PerishableProduct("milk", 12.01, 3))
                .addProduct(new Beer("red", 12.01))
                .addProduct(new Beer("dark", 12.01, 3))
                .addProduct(new Beer("light", 12.01, 7))
                .addProduct(new Сhocolate("small", 50.0, 100))
                .addProduct(new Сhocolate("easy", 55, 200))
                .addProduct(new Сhocolate("average", 60, 300))
                .addProduct(new Сhocolate("heavy", 65, 500))
                .addProduct(new Meat("dietary", 100, "chicken"))
                .addProduct(new Meat("fatty", 200, "pork"))
                .addProduct(new Meat("marble", 250, "beef"))
                .addProduct(new Meat("maritime", 500, "fish"));


//        store.printList();
        System.out.println(store);


        System.out.println("ищем Lays");
        System.out.println(store.findProduct("Lays"));
        System.out.println(store.findProduct("Bread"));

        System.out.println("покупаю Lays");
        store.buy("Lays", 123.25);
//        store.printList();
        System.out.println(store);

        System.out.println("покупаю fanta");
        store.buy("fanta", 11.33);
//        store.printList();
        System.out.println(store);

        System.out.println("покупаю milk");
        store.buy("milk", 12.01);
//        store.printList();
        System.out.println(store);

//        System.out.println(store.getMoney());
        System.out.println(store);

    }

}
