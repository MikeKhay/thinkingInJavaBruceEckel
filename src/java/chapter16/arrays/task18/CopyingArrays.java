package chapter16.arrays.task18;

import chapter16.arrays.task21.BerylliumSphere;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        chapter16.arrays.task21.BerylliumSphere[] b = {new chapter16.arrays.task21.BerylliumSphere(), new chapter16.arrays.task21.BerylliumSphere(), new chapter16.arrays.task21.BerylliumSphere()};
        System.out.println(Arrays.toString(b));

        chapter16.arrays.task21.BerylliumSphere[] b2 = { new chapter16.arrays.task21.BerylliumSphere(), new chapter16.arrays.task21.BerylliumSphere(), new chapter16.arrays.task21.BerylliumSphere(), new chapter16.arrays.task21.BerylliumSphere(), new chapter16.arrays.task21.BerylliumSphere(), new BerylliumSphere(),};
        System.out.println(Arrays.toString(b2));

        System.arraycopy(b, 0, b2, 2, b.length);
        System.out.println(Arrays.toString(b2));

    }
}
