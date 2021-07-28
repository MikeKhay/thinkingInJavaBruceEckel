package chapter15.generics.task17;

import java.util.EnumSet;

public class Sets {
    public static <T extends Enum<T>> EnumSet<T> union(EnumSet<T> a, EnumSet<T> b){
        EnumSet<T> result =  a.clone();
        result.addAll(b);
        return result;
    }

    public static <T extends Enum<T>> EnumSet<T> intersection(EnumSet<T> a, EnumSet<T> b){
        EnumSet<T> result = a.clone();
        result.retainAll(b);
        return result;
    }

    public static <T extends Enum<T>> EnumSet<T> difference(EnumSet<T> superSet, EnumSet<T> subSet){
        EnumSet<T> result = superSet.clone();
        result.removeAll(subSet);
        return result;
    }

    public static <T extends Enum<T>> EnumSet<T> complement(EnumSet<T> a, EnumSet<T> b){
        return difference(union(a,b), intersection(a,b));
    }
 }
