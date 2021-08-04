package chapter16.arrays.task21;

public class BerylliumSphere implements Comparable<BerylliumSphere>{
    private static long counter;
    private final long id = counter++;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BerylliumSphere{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(BerylliumSphere berylliumSphere) {
        return (id < berylliumSphere.id ? -1 : (id == berylliumSphere.id ? 0 : 1));
    }
}
