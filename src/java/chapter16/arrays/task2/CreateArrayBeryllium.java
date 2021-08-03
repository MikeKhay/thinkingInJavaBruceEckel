package chapter16.arrays.task2;

public class CreateArrayBeryllium {
    public static void main(String[] args) {

        BerylliumSphere[] array = createArray(10);

        for (BerylliumSphere b : array){
            System.out.println(b.toString());
        }

    }

    public static BerylliumSphere[] createArray(int size){
        BerylliumSphere[] b = new BerylliumSphere[size];
        for(int i = 0 ; i < b.length; i++){
            b[i] = new BerylliumSphere();
        }
        return b;
    }
}
