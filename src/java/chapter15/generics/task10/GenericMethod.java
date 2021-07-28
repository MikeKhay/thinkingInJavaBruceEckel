package chapter15.generics.task10;

public class GenericMethod {
    public <T,Y,Double> void f(T t, Y y, Double d){
        System.out.println(t.getClass().getName());
        System.out.println(y.getClass().getName());
        System.out.println(d.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.f("", 1, 1.0);
        System.out.println();
        gm.f("sad", 12, 1.034);
    }
}
