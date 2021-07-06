package chapter9.task2;

public class TestAbstractAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Bob") {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };

//        System.out.println(animal.name);
    }
}
