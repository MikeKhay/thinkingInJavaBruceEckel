package chapter3.task3;

public class PassObject {

    public static void f(Number objectNumber) {
        objectNumber.number = 3.14f;
    }

    public static void main(String[] args) {

        Number objectNumber = new Number();
        objectNumber.number = 12.47f;
        System.out.println("1. objectNumber.number = " + objectNumber.number);
        f(objectNumber);
        System.out.println("2. objectNumber.number = " + objectNumber.number);

    }
}
