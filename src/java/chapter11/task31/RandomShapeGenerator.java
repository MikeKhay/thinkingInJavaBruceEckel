package chapter11.task31;

import java.util.Random;

public class RandomShapeGenerator {
    private Random random = new Random();
    public Shape next(){
        switch (random.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
