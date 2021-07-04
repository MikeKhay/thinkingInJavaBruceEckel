package chapter8.task5;

public class Bicycle extends Cycle {
    private int countWheels = 2;

    @Override
    public void ride() {
        Bicycle.wheels(countWheels);
    }
}
