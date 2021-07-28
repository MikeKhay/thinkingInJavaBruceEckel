package chapter15.generics.task21;

public class TestApp {
    public static void main(String[] args) throws IllegalAccessException {
        ClassTypeCapture capture = new ClassTypeCapture();

        capture.addType("String", String.class);
        capture.addType("Integer", Integer.class);
        capture.addType("Object", Object.class);

        capture.addType("TestObject", TestObject.class);
        System.out.println(capture.createNew("TestObject"));
        System.out.println(capture.createNew("TestObject"));
        System.out.println(capture.createNew("TestObject"));

        capture.printMap();


    }
}
