package oopSeminar2;

public abstract class Herbal extends Animal{
    public Herbal(String nickname) {
        super(nickname);
    }
    public String feed(){
        return "herbal";
    }
}
