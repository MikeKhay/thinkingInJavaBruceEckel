package chapter5.task4;

public class Cat {

    String name;

    public Cat() {
        System.out.println(" I am cat!");
    }

    public Cat(String name) {
        System.out.println(" I am cat! My name : " + name);
        this.name = name;
    }
}
