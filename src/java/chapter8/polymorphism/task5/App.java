package chapter8.polymorphism.task5;

public class App {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

//        unicycle.ride();
//        bicycle.ride();
//        tricycle.ride();

        Cycle u = unicycle,
                b = bicycle,
                t = tricycle;

        u.ride();
        b.ride();
        t.ride();
    }
}
