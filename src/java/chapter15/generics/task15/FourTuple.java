package chapter15.generics.task15;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {

    protected D d;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        this.d = d;
    }


    @Override
    public String toString() {
        return "(" + a + ", " + b + ", " + c + ", " + d + ")";
    }
}
