package oopSeminar2;

public class Butterfly extends Herbal implements Flyable, Runable {
    public Butterfly(String nickname) {
        super(nickname);
    }

    @Override
    public String toString() {
        return "I'm Butterfly " + super.toString() + " my speed run is  " + speedRun()  + " my speed fly is  " + speedFly();

    }

    @Override
    public int speedRun() {
        return 0;
    }

    @Override
    public String say() {
        return "hlop hlop";
    }

    @Override
    public int speedFly() {
        return 10;
    }
}
