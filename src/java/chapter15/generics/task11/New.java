package chapter15.generics.task11;

import java.util.*;

public class New {
    public static <K,V> Map<K,V> map(){
        return new HashMap<K,V>();
    }

    public static <T> List<T> list(){
        return new ArrayList<T>();
    }

    public static <T> Set<T> set(){
        return new HashSet<T>();
    }
}
