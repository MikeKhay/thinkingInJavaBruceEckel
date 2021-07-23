package chapter8.polymorphism.task5;

public class Bicycle extends Cycle {
    private int countWheels = 2;

    @Override
    public void ride() {
        wheels(countWheels);
    }
}
