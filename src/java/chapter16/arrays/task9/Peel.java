package chapter16.arrays.task9;

public class Peel<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public Peel(int size){
        array = (T[]) new Object[size];
    }
}
