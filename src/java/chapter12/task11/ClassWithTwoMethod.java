package chapter12.task11;

public class ClassWithTwoMethod {
    public static void g() throws RuntimeException {
        System.out.println("Exception in g()");
        throw new RuntimeException();
    }

    public static void f() throws RuntimeException {
        try {
            System.out.println("Exception in f()");
            g();
        }
        catch (Exception e){
            throw e;
        }
    }
}
