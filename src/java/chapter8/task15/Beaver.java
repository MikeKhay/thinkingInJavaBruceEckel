package chapter8.task15;

public class Beaver extends Rodent {

    private Characteristic c = new Characteristic("Beaver!!!");

    public Beaver() {
        System.out.println("Beaver()");
    }

    public void move(){
        System.out.println("Swim");
    }
    public void eat(){
        System.out.println("Eat tree");
    }
}
