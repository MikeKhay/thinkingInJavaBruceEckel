package chapter12.exceptions.task17;

public class LivingCreature {
    private Characteristic p = new Characteristic("Creature");
    private Description t = new Description("Ordinal living creature");
    LivingCreature(){
        System.out.println("LivingCreature()");
    }
    protected void dispose(){
        System.out.println("dispose() in LivingCreature ");
        t.dispose();
        p.dispose();
    }
}
