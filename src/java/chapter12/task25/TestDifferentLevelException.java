package chapter12.task25;

public class TestDifferentLevelException {
    public static void main(String[] args) throws ExceptionOneLevel {
        ClassOneLevel c = new ClassThreeLevel();
        c.callException();
    }
}
