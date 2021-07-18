package chapter12.task25;

public class ClassThreeLevel extends ClassTwoLevel {
    public void callException() throws ExceptionThreeLevel {
        throw new ExceptionThreeLevel();
    }
}
