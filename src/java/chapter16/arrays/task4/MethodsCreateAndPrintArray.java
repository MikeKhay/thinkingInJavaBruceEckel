package chapter16.arrays.task4;

import java.util.Arrays;
import java.util.Random;

public class MethodsCreateAndPrintArray {
    public Double[][][] createArrayDoubleThreeDimension(int height, int weight, int depth, int minNumber, int maxNumber){
        Random random = new Random();

        Double[][][] d = new Double[height][weight][depth];
        for (int i = 0; i < d.length; i++){
            for (int j = 0; j < d[i].length ; j++){
                for (int k = 0; k < depth; k++) {
                    d[i][j][k] = ( minNumber + ( random.nextDouble() * ( maxNumber - minNumber ) ) );
                }
            }
        }

        return d;
    }
    public void printArrayDoubleTwoDimension(Double[][][] d){
        System.out.println(Arrays.deepToString(d));
    }
}
