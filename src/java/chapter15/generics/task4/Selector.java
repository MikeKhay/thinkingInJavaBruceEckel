package chapter15.generics.task4;

public interface Selector<T> {
    boolean end();
    T current();
    void next();
}
