package chapter12.exceptions.task17;

public class Amphibian extends Animal {
    private Characteristic p = new Characteristic("Can live in water");
    private Description t = new Description("And in water, and on ground");
    Amphibian(){
        System.out.println("Amphibian()");
    }
    protected void dispose(){
        System.out.println("dispose() in Amphibian ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
