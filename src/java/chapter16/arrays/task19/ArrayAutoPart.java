package chapter16.arrays.task19;

import java.util.Arrays;

public class ArrayAutoPart {
    public static void main(String[] args) {
        AutoPart[] a1 = {new AutoPart(0), new AutoPart(3), new AutoPart(7), new AutoPart(5)};

        AutoPart[] a2 = {new AutoPart(0), new AutoPart(3), new AutoPart(7), new AutoPart(5)};

        System.out.println(Arrays.equals(a1, a2)); // Without method equals is false;


    }
}
