package chapter15.generics.task15;

public class TwoTuple<A, B> {
    protected A a;
    protected B b;

    public TwoTuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "(" + a + ", " + b + ")";
    }
}
