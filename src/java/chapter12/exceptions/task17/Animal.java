package chapter12.exceptions.task17;

public class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("Has heart");
    private Description t = new Description("Animal, doesn't plant");
    Animal(){
        System.out.println("Animal()");
    }
    protected void dispose(){
        System.out.println("dispose() in Animal ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
