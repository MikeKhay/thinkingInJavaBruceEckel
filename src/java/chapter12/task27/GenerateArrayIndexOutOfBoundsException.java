package chapter12.task27;

public class GenerateArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        try{
            throw new RuntimeException();
        }
        catch (RuntimeException e){
            System.out.println("RuntimeException : " + e);
        }

    }
}
