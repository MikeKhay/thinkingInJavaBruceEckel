package chapter12.exceptions.task24;

public class CreateObjectFailingConstructor {
    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor("Hello");
            System.out.println(failingConstructor.text);
            try {

            }
            finally {
                failingConstructor.dispose();
            }

        }
        catch (NullPointerException e){
            System.out.println("Sorry NullPointerException...");
        }
        finally {
            System.out.println("Program continue work.");
        }
    }
}
