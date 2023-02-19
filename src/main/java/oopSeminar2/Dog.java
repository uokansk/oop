package oopSeminar2;

public class Dog extends Predator implements Runable {
    public Dog(String nickname) {
        super(nickname);
    }
//    @Override
    public String toString() {
        return "I'm dog " + super.toString() + " my speed is  " + speedRun();
    }

    public String say() {
        return "gav gav";
    }


    public int speedRun() {
        return 50;
    }
}
