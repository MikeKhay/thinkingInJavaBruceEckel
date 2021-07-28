package chapter15.generics.task12;

public class New {
    public static <T,A> ExplicitTypeSpecification<T,A> explicitTypeSpecification(T t, A a){
        return new ExplicitTypeSpecification<>(t, a);
    }
}
