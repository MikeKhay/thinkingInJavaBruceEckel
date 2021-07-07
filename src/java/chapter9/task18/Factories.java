package chapter9.task18;

public class Factories {
    public static void cycleConsumer(CycleFactory fact){
        Cycle cycle = fact.getCycle();
        cycle.method1();
        cycle.method2();
    }
}
