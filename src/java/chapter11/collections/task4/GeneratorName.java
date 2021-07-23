package chapter11.collections.task4;

import java.util.Random;

public class GeneratorName {

    String[] arrays = {"Mike", "Taras", "Ryslan", "Oleg", "Nathar", "Igor"};
    Random random = new Random();
    public String next(){
        int select = random.nextInt(arrays.length);
        return arrays[select];
    }
}
