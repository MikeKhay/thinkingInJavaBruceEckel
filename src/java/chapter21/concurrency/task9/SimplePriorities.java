package chapter21.concurrency.task9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class SimplePriorities implements Runnable {

    public static class SimpleThreadFactory implements ThreadFactory{

        private int priority;

        public SimpleThreadFactory(int priority){
            this.priority = priority;
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread th = new Thread(runnable);
            th.setPriority(priority);
            return th;
        }
    }


    private int countDown = 5;
    private volatile double d;

    public String toString(){
        return Thread.currentThread() + ": " + countDown;
    }
    @Override
    public void run() {
        while(true) {
            for (int i = 1; i < 100000; i++){
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0) {
                    Thread.yield();
                }
            }

            System.out.println(this);
            if (--countDown == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService execLow = Executors.newCachedThreadPool(new SimpleThreadFactory(Thread.MIN_PRIORITY));
        ExecutorService execHigh = Executors.newCachedThreadPool(new SimpleThreadFactory(Thread.MAX_PRIORITY));
        for (int i = 0; i < 5; i++){
            execLow.execute(new SimplePriorities());
        }
        execHigh.execute(new SimplePriorities());
        execLow.shutdown();
        execHigh.shutdown();
    }
}
