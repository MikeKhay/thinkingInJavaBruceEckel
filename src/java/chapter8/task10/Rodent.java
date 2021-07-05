package chapter8.task10;

import java.util.Random;

public class Rodent {

    public void move(){
//        Rodent beaver = new Rodent();
        Rodent.whatMove();
    }

    public static void whatMove(){
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if(randomNumber == 0){
            System.out.println("Run rodent");
        }
        else {
            System.out.println("Walk rodent");
        }
    }
}
