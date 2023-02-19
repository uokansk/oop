package oopSeminar2;

public class Cat extends Predator implements Runable {
    public Cat(String nickname) {
        super(nickname);
    }

    @Override
    public String toString(){
        return "I'm cat. " + super.toString() + ". My speed is " + speedRun();
    }
    @Override
    public String say(){
        return "meow-meow";
    }
    @Override
    public int speedRun() {
        return 10;
    }
}

