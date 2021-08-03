package chapter16.arrays.task1;

public class ContainerBeryllium {
    public static void main(String[] args) {

        ContainerBeryllium.showArray(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});


    }
    public static void showArray(BerylliumSphere[] berylliumSpheres){
        for (BerylliumSphere berylliumSphere : berylliumSpheres){
            System.out.println(berylliumSphere);
        }
    }
}
