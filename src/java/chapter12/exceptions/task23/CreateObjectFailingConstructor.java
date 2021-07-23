package chapter12.exceptions.task23;

public class CreateObjectFailingConstructor {
    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor1 = new FailingConstructor("Hello");
            System.out.println(failingConstructor1.text);
            try{
                FailingConstructor failingConstructor2 = new FailingConstructor("Good bay");
                try {

                } finally {
                    failingConstructor2.methodDispose.dispose();
                }
            } catch (NullPointerException e){
                System.out.println("Sorry NullPointerException with inside.");
            } finally {
                failingConstructor1.methodDispose.dispose();
            }

        } catch (NullPointerException e){
            System.out.println("Sorry NullPointerException with outside.");
        }

    }
}
