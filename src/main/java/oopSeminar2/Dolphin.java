package oopSeminar2;

public class Dolphin extends Predator implements Swimable{

    public Dolphin(String nickname) {
        super(nickname);
    }

    @Override
    public String toString() {
        return "I'm Dolphin " + super.toString()  + " my speed swim is  " + speedSwim();
    }
    @Override
    public String say() {
        return "flip flip";
    }

    @Override
    public int speedSwim() {
        return 50;
    }
}
