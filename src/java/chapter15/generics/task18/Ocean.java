package chapter15.generics.task18;

import java.util.*;

public class Ocean {
    public static void eat(BigFish bigFish, LittleFish littleFish){
        System.out.println(bigFish + " ate " + littleFish);
    }

    public static void main(String[] args) {

        Random rand = new Random(47);

        Queue<LittleFish> littleFishQueue = new LinkedList<>();
        Generators.fill(littleFishQueue, LittleFish.generator(), 30);

        List<BigFish> bigFishList = new ArrayList<>();
        Generators.fill(bigFishList, BigFish.generator, 5);
        for (LittleFish l : littleFishQueue)
            eat(bigFishList.get(rand.nextInt(bigFishList.size())), l);
    }
}
