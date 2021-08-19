package chapter21.concurrency.task5;

import java.util.concurrent.Callable;

public class FibonacciCallable implements Callable<Integer> {
    protected int size;
    private static int count = 0;
    private final int id = count++;

    public FibonacciCallable(int size){
        this.size = size;
    }

    @Override
    public Integer call() throws Exception {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        int sumAll = 0;
        for (int i = 0; i < size; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            sumAll += sum;
        }
        return sumAll;
    }
}
