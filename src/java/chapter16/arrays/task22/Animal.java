package chapter16.arrays.task22;

public class Animal {
    private static int count = 0;
    private final int id = count++;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
