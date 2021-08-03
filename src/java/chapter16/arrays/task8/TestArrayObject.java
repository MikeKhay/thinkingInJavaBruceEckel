package chapter16.arrays.task8;

import java.util.Arrays;

public class TestArrayObject {
    public static void main(String[] args) {

        Object[] o = {new Integer(7), "Hello", new Animal(), new Float(82.32f)};

        System.out.println(Arrays.deepToString(o));
    }
}
