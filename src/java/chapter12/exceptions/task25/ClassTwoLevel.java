package chapter12.exceptions.task25;

public class ClassTwoLevel extends ClassOneLevel {
    public void callException() throws ExceptionTwoLevel {
        throw new ExceptionTwoLevel();
    }
}
