package chapter12.task13;

public class CallThreeExceptions {

    public static void callOneException() throws ExceptionNumOne {
        throw new ExceptionNumOne("It is one");
    }

    public static void callTwoException() throws ExceptionNumTwo {
        throw new ExceptionNumTwo("It is two");
    }

    public static void callNullPointerException() throws NullPointerException {
        throw new NullPointerException("It is NullPointerException");
    }
}
