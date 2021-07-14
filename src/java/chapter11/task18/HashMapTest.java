package chapter11.task18;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Mike", "Lviv");
        hashMap.put("Oleg", "Vouotuchi");
        hashMap.put("Ruslan", "Yazu");
        hashMap.put("Taras", "Praga");
        hashMap.put("Khristi", "Kiyiv");

        System.out.println("Values in HashMap:");
        printMap(hashMap);
        System.out.println();

        System.out.println("Values sort in TreeMap :");
        SortedMap<String, String> sortedMap = new TreeMap<>(hashMap);
        printMap(sortedMap);
        System.out.println();

        System.out.println("Values save in LinkedHashMap with TreeMap:");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(sortedMap);
        printMap(linkedHashMap);

    }
    public static void printMap(Map<String, String> map){
        for(HashMap.Entry<String, String> m : map.entrySet()){
            System.out.println("Key = " + m.getKey() + ", Value = " + m.getValue());
        }
    }
}
