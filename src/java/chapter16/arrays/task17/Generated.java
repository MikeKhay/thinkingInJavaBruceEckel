package chapter16.arrays.task17;

import java.lang.reflect.Array;

public class Generated {
    public static <T> T[] array(T[] a, Generator<T> gen){
        for (int i = 0; i < a.length; i++){
            a[i] = gen.next();
        }
        return a;
    }

    public static <V> V[] array(Class<V> c, Generator<V> gen, int size){
        V[] v = (V[]) Array.newInstance(c, size);
        for (int i = 0; i < size ; i++){
            v[i] = gen.next();
        }
        return v;
    }
}
