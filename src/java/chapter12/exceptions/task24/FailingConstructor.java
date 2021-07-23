package chapter12.exceptions.task24;

import java.util.Random;

public class FailingConstructor {

    private static long counter = 1;
    private final long id = counter++;
    protected String text;

    public FailingConstructor(String text) {
        Random random = new Random();
        if (random.nextBoolean()){
            throw new NullPointerException();
        }
        this.text = text;
    }

    public void dispose(){
        System.out.println("NeedsCleanup " + id + " liberated.");
    }
}
