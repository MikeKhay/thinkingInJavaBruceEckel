package chapter8.polymorphism.task12;

public class Hamster extends Rodent {

    private Characteristic c = new Characteristic("Hamster!!!");

    public Hamster() {
        System.out.println("Hamster()");
    }

    public void move(){
        System.out.println("Walk");
    }
    public void eat(){
        System.out.println("Eat Grain");
    }
}
