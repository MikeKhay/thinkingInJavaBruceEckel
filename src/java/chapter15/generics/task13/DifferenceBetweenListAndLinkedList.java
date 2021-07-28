package chapter15.generics.task13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class DifferenceBetweenListAndLinkedList {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("List : " + Generators.fill(new ArrayList<String>(), new Generator<String>() {
            @Override
            public String next() {
                return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("")[random.nextInt(26)];
            }
        }, 10));

        System.out.println("LinkedList : " + Generators.fill(new LinkedList<String>(), new Generator<String>() {
            @Override
            public String next() {
                return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("")[random.nextInt(26)];
            }
        }, 10));
    }
}
