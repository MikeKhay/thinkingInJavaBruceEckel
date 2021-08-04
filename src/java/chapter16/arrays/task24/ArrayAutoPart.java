package chapter16.arrays.task24;

import java.util.Arrays;

public class ArrayAutoPart {
    public static void main(String[] args) {
        AutoPart[] a = {new AutoPart(0), new AutoPart(3), new AutoPart(7), new AutoPart(5), new AutoPart(1), new AutoPart(6)};

        Arrays.sort(a, new CompAutoPart());

        System.out.println(Arrays.binarySearch(a, new AutoPart(6), new CompAutoPart()));


    }
}
