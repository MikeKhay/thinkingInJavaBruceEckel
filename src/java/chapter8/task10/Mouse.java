package chapter8.task10;


import java.util.Random;

public class Mouse extends Rodent {
    public static void whatMove(){
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if(randomNumber == 0){
            System.out.println("Run Mouse");
        }
        else {
            System.out.println("Walk Mouse");
        }
    }
}
