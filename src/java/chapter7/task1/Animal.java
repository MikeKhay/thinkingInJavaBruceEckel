package chapter7.task1;

public class Animal {
    private Dog dog;

    public String toString(){
        if (dog == null) {
            dog = new Dog();
        }
        return "Dog : " + dog;
    }
}
