package chapter21.concurrency.task8;

import java.util.concurrent.TimeUnit;

public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            Thread t = new LiftOff();
        }
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
