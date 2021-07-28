package chapter15.generics.task13;

import java.util.LinkedList;
import java.util.List;

public class Generators {
    public static <T> List<T> fill(List<T> list, Generator<T> gen, int n){
        for(int i = 0; i < n; i++)
            list.add(gen.next());
        return list;
    }

    public static <T> LinkedList<T> fill(LinkedList<T> linkedList, Generator<T> gen, int n){
        for (int i = 0; i < n; i++)
            linkedList.add(gen.next());
        return linkedList;
    }
}
