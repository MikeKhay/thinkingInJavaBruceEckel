package chapter16.arrays.task20;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] array1 = new int[3][5];
        int[][] array2 = new int[3][5];

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                array1[i][j] = i + j;
            }
        }
        System.out.println(Arrays.deepToString(array1));

        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[i].length; j++){
                array2[i][j] = i + j;
            }
        }
        System.out.println(Arrays.deepToString(array2));

        System.out.println(Arrays.deepEquals(array1, array2));
        System.out.println();




        array2[0][2] = 2109;
        System.out.println(Arrays.deepToString(array1));
        System.out.println(Arrays.deepToString(array2));
        System.out.println(Arrays.deepEquals(array1, array2));



    }
}
