package chapter8.polymorphism.task5;

public class Unicycle extends Cycle {
    private int countWheels = 1;

    @Override
    public void ride() {
        Unicycle.wheels(countWheels);
    }
}
