package chapter4.control.test;

public class WhileTest {
    public static void main(String[] args) {

        while (condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while'");
    }

    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.println(result + ", ");
        return result;
    }
}
