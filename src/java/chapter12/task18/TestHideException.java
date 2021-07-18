package chapter12.task18;

public class TestHideException {
    public static void main(String[] args) {

        try {
            ClassWithThreeException classWithThreeException = new ClassWithThreeException();
            try{
                classWithThreeException.exceptionNumOne();
                try {
                    classWithThreeException.exceptionNumTwo();
                }
                finally {
                }
            }
            finally {
                classWithThreeException.ExceptionNumThree();
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
