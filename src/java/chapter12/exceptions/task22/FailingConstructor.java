package chapter12.exceptions.task22;

import java.util.Random;

public class FailingConstructor {
    protected String text;

    public FailingConstructor(String text) {
        Random random = new Random();
        if (random.nextBoolean()){
            throw new NullPointerException();
        }
        this.text = text;
    }
}
