package chapter16.arrays.task4;

public class ControlArrays {
    public static void main(String[] args) {
        MethodsCreateAndPrintArray methodsCreateAndPrintArray = new MethodsCreateAndPrintArray();

        int minNumber = 10;
        int maxNumber = 50;
        int heightArray = 2;
        int weightArray = 3;
        int depthArray = 4;

        Double[][][] arrayDoubleTwoDimension = methodsCreateAndPrintArray.createArrayDoubleThreeDimension(heightArray, weightArray, depthArray, minNumber, maxNumber);

        methodsCreateAndPrintArray.printArrayDoubleTwoDimension(arrayDoubleTwoDimension);

    }
}
