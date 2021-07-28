package chapter15.generics.task3;

public class SixTuple<A,B,C,D,E,F> {
    public final A a;
    public final B b;
    public final C c;
    public final D d;
    public final E e;
    public final F f;

    public SixTuple(A a, B b, C c, D d, E e, F f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    @Override
    public String toString() {
        return "SixTuple{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                ", f=" + f +
                '}';
    }
}
