package oopSeminar2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private Radio radio = new Radio();
    private List<Animal> animals = new ArrayList<>();

    public List<Animal> addAnimals(List<Animal> animals) {
        this.animals.addAll(animals);
        return this.animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Sayable> getSayAble() {
        List<Sayable> result = new ArrayList<>();
        for (Animal item : animals) {
            result.add(item);
        }
        result.add(radio);
        return result;
    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runable) {
                result.add((Runable) item);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable) {
                result.add((Flyable) item);
            }
        }
        return result;
    }

    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Swimable) {
                result.add((Swimable) item);
            }
        }
        return result;
    }

    public Runable getWiner() {
        List<Runable> runAnimals = getRunable();
        Runable winner = runAnimals.get(0);
        for (Runable item : runAnimals) {
            if (winner.speedRun() < item.speedRun()) {
                winner = item;
            }
        }
        return winner;
    }

    public Flyable getWinerFly() {
        List<Flyable> flyAnimals = getFlyable();
        Flyable winnerFly = flyAnimals.get(0);
        for (Flyable item : flyAnimals) {
            if (winnerFly.speedFly() < item.speedFly()) {
                winnerFly = item;
            }
        }
        return winnerFly;
    }

    public Swimable getWinerSwim() {
        List<Swimable> swimAnimals = getSwimable();
        Swimable winnerSwim = swimAnimals.get(0);
        for (Swimable item : swimAnimals) {
            if (winnerSwim.speedSwim() < item.speedSwim()) {
                winnerSwim = item;
            }
        }
        return winnerSwim;
    }


}
