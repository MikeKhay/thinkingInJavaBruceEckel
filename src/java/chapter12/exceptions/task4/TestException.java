package chapter12.exceptions.task4;

public class TestException {
    public static void main(String[] args) {
        try{
            String s = "Create in String";
            throw new KhaException(s);
        } catch (KhaException e) {
            e.printStackTrace(System.out);
        }
    }
}
