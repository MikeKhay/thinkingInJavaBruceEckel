package chapter9.interfaces.task18;

public class App {
    public static void main(String[] args) {
        Factories.cycleConsumer(new UnicycleFactory());
        Factories.cycleConsumer(new BicycleFactory());
        Factories.cycleConsumer(new TricycleFactory());
    }
}
