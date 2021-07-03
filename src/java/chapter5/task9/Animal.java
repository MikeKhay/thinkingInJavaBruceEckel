package chapter5.task9;

public class Animal {
    public String name;
    public int age;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age){
        this(name);
        this.age = age;
    }
}
