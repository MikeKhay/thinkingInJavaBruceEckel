package chapter15.generics.task16;

public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {

    protected F f;

    public SixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        this.f = f;
    }

    @Override
    public String toString() {
        return "(" + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ")";
    }
}
