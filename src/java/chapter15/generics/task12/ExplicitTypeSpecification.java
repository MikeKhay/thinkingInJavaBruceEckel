package chapter15.generics.task12;

public class ExplicitTypeSpecification<T, A> {

    private T t;
    private A a;

    public ExplicitTypeSpecification(T t, A a) {
        this.t = t;
        this.a = a;
    }

    @Override
    public String toString() {
        return "ExplicitTypeSpecification{" +
                "t=" + t.getClass().getSimpleName() +
                ", a=" + a.getClass().getSimpleName() +
                '}';
    }
}
