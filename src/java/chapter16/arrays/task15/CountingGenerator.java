package chapter16.arrays.task15;

public class CountingGenerator {
    public static class BerylliumSphereGenerator implements Generator<BerylliumSphere> {
        @Override
        public BerylliumSphere next() {
            return new BerylliumSphere();
        }
    }

    public static void main(String[] args) {

        CountingGenerator.BerylliumSphereGenerator bsg = new CountingGenerator.BerylliumSphereGenerator();

        BerylliumSphere[] bs = Generated.array(BerylliumSphere.class, bsg, 10);
        for(BerylliumSphere b : bs){
            System.out.println(b.toString());
        }

        System.out.println();

        BerylliumSphere[] bs2 = new BerylliumSphere[7];
        BerylliumSphere[] array = Generated.array(bs2, bsg);
        for (BerylliumSphere b : array){
            System.out.println(b.toString());
        }
    }
}
