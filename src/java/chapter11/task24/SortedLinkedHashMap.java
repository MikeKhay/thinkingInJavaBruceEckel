package chapter11.task24;

import java.util.*;

public class SortedLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("B","B");
        linkedHashMap.put("C","C");
        linkedHashMap.put("A","A");
        linkedHashMap.put("J","J");
        linkedHashMap.put("D","D");
        linkedHashMap.put("1","1");
        linkedHashMap.put("2","2");
        linkedHashMap.put("9","9");
        linkedHashMap.put("0","0");
        linkedHashMap.put("5","5");

        printMap(linkedHashMap);
        System.out.println();

        Map<String, Integer> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);


        SortedMap<String, String> sortedMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        sortedMap.putAll(linkedHashMap);

        System.out.println("After sort LinkedHashMap : ");
        printMap(sortedMap);



    }

    public static void printMap(Map<String, String> m){
        for (Map.Entry<String, String> map : m.entrySet()){
            System.out.println("Key = " + map.getKey() + ", value = " + map.getValue());
        }
    }
}
