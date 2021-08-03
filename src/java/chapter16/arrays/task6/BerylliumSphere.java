package chapter16.arrays.task6;

public class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "BerylliumSphere{" +
                "id=" + id +
                '}';
    }
}
