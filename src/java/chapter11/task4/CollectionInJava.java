package chapter11.task4;

import java.util.*;

public class CollectionInJava {

    String[] arrayName;

    public static void main(String[] args) {
        GeneratorName generatorName = new GeneratorName();

        System.out.println("Array random generation:");
        String[] arrayName = new String[20];
        for (int i = 0; i < arrayName.length; i++)
            arrayName[i] = generatorName.next();
        for(String s : arrayName)
            System.out.print(s + ", ");

        System.out.println();
        System.out.println("ArrayList random generation:");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            arrayList.add(generatorName.next());
        for(String s : arrayList)
            System.out.print(s + ", ");

        System.out.println();
        System.out.println("LinkedList random generation:");
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 20; i++)
            linkedList.add(generatorName.next());
        for(String s : linkedList)
            System.out.print(s + ", ");

        System.out.println();
        System.out.println("HashSet random generation:");
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < 20; i++)
            hashSet.add(generatorName.next());
        for(String s : hashSet)
            System.out.print(s + ", ");

        System.out.println();
        System.out.println("LinkedHashSet random generation:");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 20; i++)
            linkedHashSet.add(generatorName.next());
        for(String s : linkedHashSet)
            System.out.print(s + ", ");

        System.out.println();
        System.out.println("TreeSet random generation:");
        TreeSet<String> treeSet = new TreeSet<>();
        for (int i = 0; i < 20; i++)
            treeSet.add(generatorName.next());
        for(String s : treeSet)
            System.out.print(s + ", ");

    }
}
