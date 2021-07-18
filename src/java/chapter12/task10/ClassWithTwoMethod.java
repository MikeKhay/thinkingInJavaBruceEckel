package chapter12.task10;

public class ClassWithTwoMethod {
    public static void g() throws MyException {
        System.out.println("Exception in g()");
        throw new MyException();
    }

    public static void f() throws MyException {
        try {
            System.out.println("Exception in f()");
            g();
        }
        catch (Exception e){
            throw e;
        }
    }
}
