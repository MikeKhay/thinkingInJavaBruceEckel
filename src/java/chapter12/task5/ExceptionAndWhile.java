package chapter12.task5;

public class ExceptionAndWhile {
    public static void main(String[] args) {
        int count = 0;
        while(true){
            if(count >= 10){
                System.out.println("While finished. Exception doesn't have.");
                break;
            }
            else {
                try {
                    count++;
                    throw new NumberFormatException("It is Exception ." + count);
                }
                catch (NumberFormatException s){
                    s.printStackTrace(System.out);
                }
            }
        }
    }
}
