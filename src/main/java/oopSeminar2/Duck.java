package oopSeminar2;

public class Duck extends Herbal implements Flyable, Runable, Swimable {
    public Duck(String nickname) {
        super(nickname);
    }

    @Override
    public String toString() {
        return "I'm duck " + super.toString() + " my speed run is  " + speedRun()  + " my speed fly is  " + speedFly();
    }

    @Override
    public int speedRun() {
        return 10;
    }

    @Override
    public String say() {
        return "krya krya";
    }

    @Override
    public int speedFly() {
        return 50;
    }

    @Override
    public int speedSwim() {
        return 20;
    }
}
