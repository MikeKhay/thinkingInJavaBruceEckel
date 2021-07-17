package chapter11.task28;

import java.util.PriorityQueue;
import java.util.Random;

public class TestPriorityQueue {
    public static void main(String[] args) {
        Random random = new Random();

        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            System.out.println(priorityQueue.offer(random.nextDouble()));
        }

        System.out.println();

        for (int j = 0; j < priorityQueue.size(); j++){
            System.out.println(priorityQueue.poll());
        }
    }
}
