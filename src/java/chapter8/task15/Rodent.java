package chapter8.task15;

public class Rodent {
    private Characteristic characteristic = new Characteristic("Rodent");
    private static long counter = 0;
    private final long id = counter++;

    public Rodent() {
        System.out.println("Create " + this);
        this.characteristic = characteristic;
        this.characteristic.addRef();
    }

    public void move(){
        System.out.println("Move");
    }
    public void eat(){
        System.out.println("Eat all");
    }

    public String toString(){
        return "Rodent " + id;
    }
}
