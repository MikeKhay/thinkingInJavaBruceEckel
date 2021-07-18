package chapter12.task9;

public class CallThreeExceptions {

    public static void callOneException() throws ExceptionNumOne {
        throw new ExceptionNumOne("It is one");
    }

    public static void callTwoException() throws ExceptionNumTwo {
        throw new ExceptionNumTwo("It is two");
    }

    public static void callThreeException() throws ExceptionNumThree {
        throw new ExceptionNumThree("It is three");
    }
}
