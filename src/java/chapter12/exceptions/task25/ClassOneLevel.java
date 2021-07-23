package chapter12.exceptions.task25;

public class ClassOneLevel {
    public void callException() throws ExceptionOneLevel {
        throw new ExceptionOneLevel();
    }
}
