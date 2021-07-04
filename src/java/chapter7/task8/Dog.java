package chapter7.task8;

public class Dog extends Animal {
    int age;

    public Dog(String name) {
        super(name);
        System.out.println("Dog constructor doesn't argument");
    }

    public Dog(String name, int age) {
        super(name);
        this.age = age;
        System.out.println("Dog constructor with argument");
    }

}
