package chapter11.task29;

import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        PriorityQueue<SimpleClass> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new SimpleClass());
        priorityQueue.add(new SimpleClass());
        priorityQueue.add(new SimpleClass());
        priorityQueue.offer(new SimpleClass());
        priorityQueue.offer(new SimpleClass());
        priorityQueue.offer(new SimpleClass());


        for (SimpleClass s : priorityQueue)
            System.out.println(s);
    }
}
