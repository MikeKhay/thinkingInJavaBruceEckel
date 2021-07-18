package chapter12.task30;

public class Human {
    public static void main(String[] args) {

        WrapCheckedException wce = new WrapCheckedException();
        wce.throwRuntimeException(3);

        for (int i = 0 ; i < 4; i++)
            try {
                if(i < 3)
                    wce.throwRuntimeException(i);
                else
                    throw new SomeOtherException();
            } catch (SomeOtherException e) {
                System.out.println("SomeOtherException : " + e);
            } catch (RuntimeException re){
                try {
                    throw re.getCause();
                } catch (Sneeze e){
                    System.out.println("Sneeze : " + e);
                } catch (Annoyance e){
                    System.out.println("Annoyance : " + e);
                } catch (Throwable e) {
                    System.out.println("Throwable : " + e);
                }
            }




        try{
            throw new Sneeze();
        } catch (Sneeze s){
            System.out.println("Intercepted Sneeze");
        } catch (Annoyance a){
            System.out.println("Intercepted Annoyance");
        }

        try{
            throw new Sneeze();
        } catch (Annoyance a){
            System.out.println("Intercepted Base");
        }
    }
}
