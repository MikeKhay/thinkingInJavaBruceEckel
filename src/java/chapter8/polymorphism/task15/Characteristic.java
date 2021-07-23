package chapter8.polymorphism.task15;

public class Characteristic {

    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Create Characteristic " + s);
    }

    public void addRef(){
        refCount++;
    }
}
