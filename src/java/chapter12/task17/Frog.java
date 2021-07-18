package chapter12.task17;

public class Frog extends Amphibian {
    public Frog(){
        System.out.println("Frog()");
    }
    protected void dispose(){
        super.dispose();
    }

    public static void main(String[] args) {
        try {
            Frog frog = new Frog();
            Characteristic p = new Characteristic("Croaks");
            Description t = new Description("Eat beetles");

            System.out.println("Good bay");
            frog.dispose();
            System.out.println("Finished Frog");
            t.dispose();
            p.dispose();
        }
        finally {
            System.out.println("Finally do.");
        }
    }
}
