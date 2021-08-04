package chapter16.arrays.task21;

import java.util.Arrays;
import java.util.Comparator;

public class CopyingArrays {
    public static void main(String[] args) {
        BerylliumSphere[] b = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
//        System.out.println(Arrays.toString(b));

        BerylliumSphere[] b2 = { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
//        System.out.println(Arrays.toString(b2));

        System.arraycopy(b, 0, b2, 2, b.length);
//        System.out.println(Arrays.toString(b2));

        System.out.println("Before sorting : ");
        System.out.println(Arrays.toString(b2));
        Arrays.sort(b2);
        System.out.println("After sorting comparable : ");
        System.out.println(Arrays.toString(b2));
        Arrays.sort(b2, Comparator.reverseOrder());
        System.out.println("After sorting and revers order comparator : ");
        System.out.println(Arrays.toString(b2));

    }
}
