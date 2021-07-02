package chapter3.task7;

import java.util.Random;

public class ThrowMonet {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(2);
        if (number == 0){
            System.out.println("Eagle");
        }
        else {
            System.out.println("Reshka");
        }
    }
}
