package chapter11.collections.task2;

import java.util.*;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();

            for(int i = 0; i < 10; i++)
                c.add(i);

            for(Integer i : c)
                System.out.print(i + ", ");


    }
}
