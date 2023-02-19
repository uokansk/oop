package oopSeminar2;

public class Rabbit extends Herbal implements Runable {
    public Rabbit(String nickname) {
        super(nickname);
    }
    @Override
    public String toString() {
        return "I'm Rabbit " + super.toString() + " my speed is  " + speedRun();
    }
    @Override
    public String say() {
        return "rabbit";
    }

    @Override
    public int speedRun() {
        return 40;
    }
}
