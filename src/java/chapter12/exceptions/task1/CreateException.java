package chapter12.exceptions.task1;

public class CreateException {

    public static void createException() throws MyException{
        System.out.println("Create MyException with createException() ");
        throw new MyException("Create in createException");
    }

    public static void main(String[] args) {
        try{
            createException();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        finally {
            System.out.println("Program finished.");
        }
    }
}
