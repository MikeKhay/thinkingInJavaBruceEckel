package chapter5.task8;

public class Apple {

    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
