package chapter12.exceptions.task28;

public class KhaException extends RuntimeException {
    public KhaException() {}
    public KhaException(String s){
        super(s);
    }
}
