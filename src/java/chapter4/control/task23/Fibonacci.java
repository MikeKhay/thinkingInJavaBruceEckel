package chapter4.control.task23;

public class Fibonacci {
    public static void main(String[] args) {

        int countNumFibonacci = 5;
        int x = 1;
        int z = 0;
        int y;

        for (int i = 1; i <= countNumFibonacci; i++){
            y = x + z;
            System.out.println(y);
            z = x;
            x = y;


        }
    }
}
