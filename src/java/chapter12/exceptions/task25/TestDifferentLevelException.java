package chapter12.exceptions.task25;

public class TestDifferentLevelException {
    public static void main(String[] args) throws ExceptionOneLevel {
        ClassOneLevel c = new ClassThreeLevel();
        c.callException();
    }
}
