package chapter3.task4;

import java.util.Random;

public class SpeedProgram {
    public static void main(String[] args) {
        Random random = new Random();

        int km = random.nextInt(500);
        int min = random.nextInt(600);

        double hour = min/60.0;

        System.out.println("Kilometers = " + km);
        System.out.println("Minutes = " + min);
        System.out.println("Average speed = " + (km/hour) + " km/hour");
    }
}
