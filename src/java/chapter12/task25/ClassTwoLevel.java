package chapter12.task25;

public class ClassTwoLevel extends ClassOneLevel {
    public void callException() throws ExceptionTwoLevel {
        throw new ExceptionTwoLevel();
    }
}
