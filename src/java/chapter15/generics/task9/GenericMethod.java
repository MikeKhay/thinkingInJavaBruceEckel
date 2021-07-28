package chapter15.generics.task9;

public class GenericMethod {
    public <T,Y,A> void f(T t, Y y, A a){
        System.out.println(t.getClass().getName());
        System.out.println(y.getClass().getName());
        System.out.println(a.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.f("", 1, 1.0);
    }
}
