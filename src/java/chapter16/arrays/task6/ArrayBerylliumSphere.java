package chapter16.arrays.task6;

import java.util.Arrays;

public class ArrayBerylliumSphere {
    public static void main(String[] args) {

        BerylliumSphere[][] b = arrayBerylliumSphere(3,5);

        System.out.println(Arrays.deepToString(b));
    }
    public static BerylliumSphere[][] arrayBerylliumSphere(int height, int weight){
        BerylliumSphere[][] b = new BerylliumSphere[height][weight];
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                b[i][j] = new BerylliumSphere();
            }
        }
        return b;
    }
}
