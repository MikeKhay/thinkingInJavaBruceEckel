package chapter11.collections.task11;

import java.util.*;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(6,3,8,9,2,4,7,9));
        MethodIterator.getPrintCollection(arrayList);
        System.out.println();

        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        MethodIterator.getPrintCollection(linkedList);
        System.out.println();

        HashSet<Integer> hashSet = new HashSet<>(linkedList);
        MethodIterator.getPrintCollection(hashSet);
        System.out.println();

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(hashSet);
        MethodIterator.getPrintCollection(linkedHashSet);
        System.out.println();

    }
}
