package chapter21.concurrency.task6;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask implements Runnable {
    private static int count = 0;
    private final int id = count++;

    private Random random = new Random();

    @Override
    public void run() {
        try {
            System.out.println("Begin sleep id : " + id);
            int time = (random.nextInt(9000) + 1000);
            TimeUnit.MILLISECONDS.sleep(time);
            System.out.println("Finish sleep id : " + id + ", time : " + time + " milliseconds.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++){
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
