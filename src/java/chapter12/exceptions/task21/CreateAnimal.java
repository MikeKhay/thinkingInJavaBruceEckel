package chapter12.exceptions.task21;

public class CreateAnimal {
    public static void main(String[] args) {
        try {
            Dog dog = new Dog("Pit bull", "Bob");
            System.out.println(dog.toString());
        } catch (MyException e) {
            System.out.println("Animal wasn't create.");
        }
    }
}
