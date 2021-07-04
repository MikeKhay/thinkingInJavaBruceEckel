package chapter8.task5;

public class Unicycle extends Cycle {
    private int countWheels = 1;

    @Override
    public void ride() {
        Unicycle.wheels(countWheels);
    }
}
