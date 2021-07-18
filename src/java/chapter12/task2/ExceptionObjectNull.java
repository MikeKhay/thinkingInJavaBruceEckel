package chapter12.task2;

public class ExceptionObjectNull {
    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println("Object is null...");
        }
    }
}
