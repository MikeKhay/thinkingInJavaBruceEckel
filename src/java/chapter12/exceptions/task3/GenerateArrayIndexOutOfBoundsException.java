package chapter12.exceptions.task3;

public class GenerateArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        try{
            throw new ArrayIndexOutOfBoundsException("Create ArrayIndexOutOfBoundsException");
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace(System.out);
        }

    }
}
