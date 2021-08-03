package chapter16.arrays.task7;

import java.util.Arrays;

public class ArrayBerylliumSphere {
    public static void main(String[] args) {

        BerylliumSphere[][][] b = arrayBerylliumSphere(3,5, 2);

        System.out.println(Arrays.deepToString(b));
    }
    public static BerylliumSphere[][][] arrayBerylliumSphere(int height, int weight, int depth){
        BerylliumSphere[][][] b = new BerylliumSphere[height][weight][depth];
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                for (int k = 0; k < depth; k++) {
                    b[i][j][k] = new BerylliumSphere();
                }
            }
        }
        return b;
    }
}
