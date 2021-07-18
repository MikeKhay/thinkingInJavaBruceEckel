package chapter12.task23;

import java.util.Random;

public class FailingConstructor {
    protected MethodDispose methodDispose;
    protected String text;

    public FailingConstructor(String text) {
        Random random = new Random();
        if (random.nextBoolean()){
            throw new NullPointerException();
        }
        this.methodDispose = new MethodDispose();
        this.text = text;
    }
}
