package chapter3.task10;

public class App {
    public static void main(String[] args) {

        int number1 = 13;
        int number2 = 8;

        System.out.println("Num1 = " + Integer.toBinaryString(number1) + " . Num2 = " + Integer.toBinaryString(number2)
                + " . Result & = " + Integer.toBinaryString(number1 & number2));

        System.out.println("Num1 = " + Integer.toBinaryString(number1) + " . Num2 = " + Integer.toBinaryString(number2)
                + " . Result | = " + Integer.toBinaryString(number1 | number2));

        System.out.println("Num1 = " + Integer.toBinaryString(number1) + " . Num2 = " + Integer.toBinaryString(number2)
                + " . Result ^ = " + Integer.toBinaryString(number1 ^ number2));

        System.out.println("Num1~ = " + ~number1);

    }
}
