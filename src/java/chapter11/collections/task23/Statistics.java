package chapter11.collections.task23;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public static void main(String[] args) {

        int countTest = 0;

        while (countTest<=10) {
            int count = 0;
            int key = 0;
            countTest++;

            Random rand = new Random();

            Map<Integer, Integer> m = new HashMap<>();

            for (int i = 0; i < 1000; i++) {
                int r = rand.nextInt(10);
                Integer freq = m.get(r);
                m.put(r, freq == null ? 1 : freq + 1);
            }

            for (Map.Entry<Integer, Integer> mapCount : m.entrySet()) {
                if (count < mapCount.getValue()) {
                    key = mapCount.getKey();
                    count = mapCount.getValue();
                }
            }

            System.out.println("Test = " + countTest + ", the number is most often generated = " + key + ", Count = " + count + ", " + ( 100 * count / 1000 ) + " %.");
        }
    }
}
