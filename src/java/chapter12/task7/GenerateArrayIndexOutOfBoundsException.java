package chapter12.task7;

public class GenerateArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        try{
            throw new ArrayIndexOutOfBoundsException();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Create ArrayIndexOutOfBoundsException");
        }

    }
}
