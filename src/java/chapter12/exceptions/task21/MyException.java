package chapter12.exceptions.task21;

public class MyException extends Exception {
    public MyException() {}
    public MyException(String s){
        super(s);
    }
}