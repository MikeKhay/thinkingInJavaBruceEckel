package chapter12.exceptions.task8;

public class ExcitationException {

    public static void excitationException() throws KhaException {
        throw new KhaException();
    }
    public static void main(String[] args) throws KhaException {
        try {
            excitationException();
        }
        catch (KhaException e){
            System.out.println("Intercepted Exception.");
        }
    }
}
