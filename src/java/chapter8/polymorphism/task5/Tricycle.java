package chapter8.polymorphism.task5;

public class Tricycle extends Cycle {
    private int countWheels = 3;

    @Override
    public void ride() {
        Tricycle.wheels(countWheels);
    }
}
