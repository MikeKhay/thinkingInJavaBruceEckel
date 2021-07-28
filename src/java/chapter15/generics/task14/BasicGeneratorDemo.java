package chapter15.generics.task14;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CounterObject> gen = new BasicGenerator<CounterObject>(CounterObject.class);
        for(int i = 0; i < 20; i++){
            System.out.println(gen.next());
        }
    }
}
