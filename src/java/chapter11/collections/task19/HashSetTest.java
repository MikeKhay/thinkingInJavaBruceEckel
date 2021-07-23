package chapter11.collections.task19;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Mike");
        hashSet.add("Ruslan");
        hashSet.add("Taras");
        hashSet.add("Oleg");
        hashSet.add("Khristi");

        System.out.println("Values in HashSet : ");
        printSet(hashSet);
        System.out.println();

        SortedSet<String> sortedSet = new TreeSet<>(hashSet);
        System.out.println("Values in TreeSet(SortedSet) : ");
        printSet(sortedSet);
        System.out.println();

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(sortedSet);
        System.out.println("Values save in LinkedHashSet with TreeSet : ");
        printSet(linkedHashSet);
        System.out.println();
    }

    public static void printSet(Set<String> set){
        for (String s: set){
            System.out.println(s.toString());
        }
    }
}
