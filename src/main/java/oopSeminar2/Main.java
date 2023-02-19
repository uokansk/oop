package oopSeminar2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoopark = new Zoo();
        zoopark.addAnimals(List.of(new Cat("Barsik"),
                new Dog("Sharik"),
                new Cow("Zorka"),
                new Rabbit("Whik"),
                new Duck("Donald"),
                new Butterfly("Bel"),
                new Dolphin("Flipper")));
//        for (Animal item : zoopark.getAnimals()) {
//            System.out.println(item.say());
//        }
//        for (Sayable item : zoopark.getSayAble()) {
//            System.out.println(item.say());
//        }
        System.out.println();
        System.out.println("All run//////////////////////////");
        for (Runable item : zoopark.getRunable()) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("All fly/////////////////////////");
        for (Flyable item : zoopark.getFlyable()) {
            System.out.println(item);
        }

        System.out.println();
        System.out.println("All swim//////////////////////////");
        for (Swimable item : zoopark.getSwimable()) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("Winer Run/////////////////////////");
        System.out.println(zoopark.getWiner());

        System.out.println();
        System.out.println("Fly Winer/////////////////////////");
        System.out.println(zoopark.getWinerFly());

        System.out.println();
        System.out.println("Swim Winer/////////////////////////");
        System.out.println(zoopark.getWinerSwim());
    }
}
