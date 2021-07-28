package chapter15.generics.task15;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {

    protected E e;

    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        this.e = e;
    }

    @Override
    public String toString() {
        return "(" + a + ", " + b + ", " + c + ", " + d + ", " + ")";
    }
}
