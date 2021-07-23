package chapter8.polymorphism.task18;

public class App {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle u = unicycle,
                b = bicycle,
                t = tricycle;

        ((Unicycle)u).balance();
        ((Bicycle)b).balance();
//        ((Tricycle)t).balance();
    }
}
