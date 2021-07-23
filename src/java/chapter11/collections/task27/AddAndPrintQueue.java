package chapter11.collections.task27;

import java.util.LinkedList;
import java.util.Queue;

public class AddAndPrintQueue {
    Queue<Command> commandQueue = new LinkedList<>();

    public Queue getQueue(){
        return commandQueue;
    }

    public void addAndPrintQueue(Command command){
        commandQueue.add(command);

        for (Command c : commandQueue)
            System.out.println(c.toString());
        System.out.println();
    }
}
