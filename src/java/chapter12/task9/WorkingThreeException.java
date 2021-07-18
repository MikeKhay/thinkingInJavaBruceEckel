package chapter12.task9;

public class WorkingThreeException {
    public static void main(String[] args){

        try {
            CallThreeExceptions.callOneException();
            CallThreeExceptions.callTwoException();
            CallThreeExceptions.callThreeException();
        }
        catch (Exception e){
            System.out.println("Everything Exception processed.");
        }
    }
}
