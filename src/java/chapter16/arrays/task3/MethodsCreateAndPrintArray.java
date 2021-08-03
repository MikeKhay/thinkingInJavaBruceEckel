package chapter16.arrays.task3;

import java.util.Random;

public class MethodsCreateAndPrintArray {
    public Double[][] createArrayDoubleTwoDimension(int height, int weight, int minNumber, int maxNumber){
        Random random = new Random();

        Double[][] d = new Double[height][weight];
        for (int i = 0; i < d.length; i++){
            for (int j = 0; j < d[i].length ; j++){
                d[i][j] = (minNumber + (random.nextDouble()*(maxNumber-minNumber)));
            }
        }

        return d;
    }
    public void printArrayDoubleTwoDimension(Double[][] d){
//        System.out.println(Arrays.deepToString(d));
        for (int i = 0; i < d.length; i++){
            System.out.println();
            for (int j = 0; j < d[i].length; j++){
                System.out.print( d[i][j] + ",   ");
            }
        }
    }
}
