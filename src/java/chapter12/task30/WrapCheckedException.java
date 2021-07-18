package chapter12.task30;

public class WrapCheckedException {
    void throwRuntimeException(int type) {
        try{
            switch (type){
                case 0: throw new Sneeze();
                case 1: throw new Annoyance();
                case 2: throw new RuntimeException();
                default: return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
