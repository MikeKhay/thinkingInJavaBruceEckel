package chapter16.arrays.task23;

import java.util.Arrays;

public class SortArrayInteger {
    public static void main(String[] args) {
        Integer[] integers = {3,6,8,2,5,9,0,1,2,3,7,3,5,8};

        for (int i = 0; i < integers.length; i++){
            integers[i] = (Integer) integers[i];
        }

        System.out.println("Before sort : " + Arrays.toString(integers));
        Arrays.sort(integers, new CompInteger().reversed());
        System.out.println("After reversed sort : " + Arrays.toString(integers));

    }
}
