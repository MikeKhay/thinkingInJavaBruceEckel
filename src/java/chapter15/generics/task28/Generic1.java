package chapter15.generics.task28;

public class Generic1<T> {

    private T item;

    public Generic1(T t) {
        item = t;
    }

    public void setArgumentTypeT(T t) {
        item = t;
        System.out.println("setArgumentTypeT() : " + item);
    }
}
