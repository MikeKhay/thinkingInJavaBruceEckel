package chapter4.control.task16;

import java.util.Random;

public class NumberForIfElse {
    public static void main(String[] args) {

        Random r = new Random();

        for (int i = 0; i < 25; i++){

            int num1 = r.nextInt(25);
            int num2 = r.nextInt(25);

            if (num1 < num2){
                System.out.println("num1 < num2");
            }
            else if (num1 == num2){
                System.out.println("num1 == num2");
            }
            else {
                System.out.println("num1 > num2");
            }
        }
    }
}
