package chapter8.polymorphism.task14;

public class Shared {

    private int refCount = 0;
    private static long counter = 0;
    private final long ib = counter++;

    public Shared(){
        System.out.println("Create " + this);
    }

    public void addRef(){
        refCount++;
    }

    protected void dispose(){
        if(--refCount == 0)
            System.out.println("Disposing " + this);
    }

    @Override
    public String toString() {
        return "Shared " + ib;
    }
}
