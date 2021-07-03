package chapter5.task2;

public class App {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Both");
        Dog dog2 = new Dog("Bob");

        System.out.println("Type animal : " + dog1.type + " . Name : " + dog1.name);
        System.out.println("Type animal : " + dog2.type + " . Name : " + dog2.name);

    }
}
