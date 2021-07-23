package chapter5.initialization.task8;

public class Apple {

    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
