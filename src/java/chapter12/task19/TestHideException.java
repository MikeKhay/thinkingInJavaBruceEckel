package chapter12.task19;

public class TestHideException {
    public static void main(String[] args) {

        try {
            ClassWithTwoException classWithThreeException = new ClassWithTwoException();
            try{
                classWithThreeException.exceptionNumOne();
                classWithThreeException.exceptionNumTwo();

            }
            finally {
                return;
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
