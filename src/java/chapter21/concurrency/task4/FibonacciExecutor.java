package chapter21.concurrency.task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FibonacciExecutor implements Runnable {
    protected int size;
    private static int count = 0;
    private final int id = count++;

    public FibonacciExecutor(int size){
        this.size = size;
    }
    @Override
    public void run() {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("#" + id + "(" + num1 + "), ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            Thread.yield();
        }
    }

    public static void main(String[] args) {

//        ExecutorService exec = Executors.newCachedThreadPool();
//        ExecutorService exec = Executors.newFixedThreadPool(3);
        ExecutorService exec = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 3; i++){
            exec.execute(new FibonacciExecutor(10));
        }
        exec.shutdown();
    }
}
