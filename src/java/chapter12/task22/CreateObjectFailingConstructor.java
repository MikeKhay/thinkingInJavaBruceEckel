package chapter12.task22;

public class CreateObjectFailingConstructor {
    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor("Hello");
            System.out.println(failingConstructor.text);
        }
        catch (NullPointerException e){
            System.out.println("Sorry NullPointerException...");
        }
        finally {
            System.out.println("Program continue work.");
        }
    }
}
