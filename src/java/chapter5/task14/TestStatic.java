package chapter5.task14;

public class TestStatic {

    static String string1 = "I am string 1";
    static String string2;

    static {
        string2 = "I am string 2";
    }

    static void printString(){
        System.out.println(string1);
        System.out.println(string2);
    }

}
