package oopSeminar2;

public class Cow extends Herbal implements Runable {
    public Cow(String nickname) {
        super(nickname);
    }
    @Override
    public String toString() {
        return "I'm cow " + super.toString() + " my speed is  " + speedRun();
    }
    @Override
    public String say() {
        return "muuuu";
    }

    @Override
    public int speedRun() {
        return 5;
    }
}
