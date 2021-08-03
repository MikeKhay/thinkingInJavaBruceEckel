package chapter16.arrays.task3;

public class ControlArrays {
    public static void main(String[] args) {
        MethodsCreateAndPrintArray methodsCreateAndPrintArray = new MethodsCreateAndPrintArray();

        int minNumber = 10;
        int maxNumber = 50;
        int heightArray = 3;
        int weightArray = 5;

        Double[][] arrayDoubleTwoDimension = methodsCreateAndPrintArray.createArrayDoubleTwoDimension(heightArray, weightArray, minNumber, maxNumber);

        methodsCreateAndPrintArray.printArrayDoubleTwoDimension(arrayDoubleTwoDimension);

    }
}
