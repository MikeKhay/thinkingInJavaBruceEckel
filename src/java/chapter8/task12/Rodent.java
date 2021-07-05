package chapter8.task12;

public class Rodent {
    private Characteristic c = new Characteristic("Rodent!!!");

    public Rodent() {
        System.out.println("Rodent()");
    }

    public void move(){
        System.out.println("Move");
    }
    public void eat(){
        System.out.println("Eat all");
    }
}
