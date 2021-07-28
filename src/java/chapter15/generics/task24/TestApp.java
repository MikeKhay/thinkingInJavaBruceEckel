package chapter15.generics.task24;

public class TestApp {
    public static void main(String[] args) throws IllegalAccessException {
        ClassTypeCapture capture = new ClassTypeCapture();

        capture.addType("Test", TestObject.factory);
        System.out.println(capture.createNew("TestObject"));
        System.out.println(capture.createNew("TestObject"));
        System.out.println(capture.createNew("TestObject"));

        capture.printMap();
    }
}
