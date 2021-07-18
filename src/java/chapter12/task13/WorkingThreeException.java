package chapter12.task13;

public class WorkingThreeException {
    public static void main(String[] args){

        try {
            CallThreeExceptions.callOneException();
            CallThreeExceptions.callTwoException();
            CallThreeExceptions.callNullPointerException();
        }
        catch (Exception e){
            System.out.println("Everything Exception processed.");
        }
        finally {
            System.out.println("You are in finally block.");
        }
    }
}
