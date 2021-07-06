package chapter9.task9;

import java.util.Random;

public class RandomInstrumentGenerator {
    private Random random = new Random(47);
    public Instrument next(){
        switch (random.nextInt(7)){
            default:
            case 0: return new Brass();
            case 1: return new Guitar();
            case 2: return new Woodwind();
            case 3: return new Percussion();
            case 4: return new Stringed();
            case 5: return new Violin();
            case 6: return new Wind();
        }
    }
}
