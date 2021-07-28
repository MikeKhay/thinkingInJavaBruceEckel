package chapter15.generics.task28;

public class Generic2<T> {
    private T item;

    public Generic2(T t) {
        item = t;
    }

    public T getArgumentTypeT(){
        System.out.println("getArgumentTypeT() : " + item);
        return item;
    }
}
