package chapter21.concurrency.task7;

public class DaemonSpawn implements Runnable {
    @Override
    public void run() {
        while(true){
            Thread.yield();
        }
    }
}
