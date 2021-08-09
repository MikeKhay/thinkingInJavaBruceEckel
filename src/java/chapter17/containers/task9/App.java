package chapter17.containers.task9;

import java.util.Comparator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Generator<String> strGen = new RandomGenerator.String();
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return String.CASE_INSENSITIVE_ORDER.compare(s1, s2);
            }
        });
        int size = 10;
        for (int i = 0; i < size; i++){
            treeSet.add(strGen.next());
        }
        System.out.println(treeSet);
    }
}
