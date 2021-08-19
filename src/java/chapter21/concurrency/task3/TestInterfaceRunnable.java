package chapter21.concurrency.task3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestInterfaceRunnable implements Runnable {
    protected int max = 10;
    private static int count = 0;
    private final int id = count++;

    public TestInterfaceRunnable(){
        System.out.println("Operation No. " + id + " is initialized.");
    }
    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("#" + id + "(" + ( max-- ) + ")");
            Thread.yield();
        }
        System.out.println("Operation No. " + id + " is finished");
    }

    public static void main(String[] args) {

//        ExecutorService exec = Executors.newCachedThreadPool();
//        ExecutorService exec = Executors.newFixedThreadPool(5);
        ExecutorService exec = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++){
            exec.execute(new TestInterfaceRunnable());
        }
        exec.shutdown();
    }
}
