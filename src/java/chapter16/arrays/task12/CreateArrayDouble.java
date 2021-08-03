package chapter16.arrays.task12;

public class CreateArrayDouble {
    public static void main(String[] args) {

        CountingGenerator.Double genDouble = new CountingGenerator.Double();
        double[] d = new double[10];

        for(int i = 0; i < d.length; i++){
            d[i] = genDouble.next();
        }

        for(Double dd : d){
            System.out.println(dd);
        }
    }
}
