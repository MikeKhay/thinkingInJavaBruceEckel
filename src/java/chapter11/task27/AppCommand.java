package chapter11.task27;

import java.util.Queue;

public class AppCommand {
    public static void main(String[] args) {

        AddAndPrintQueue addAndPrintQueue = new AddAndPrintQueue();
        addAndPrintQueue.addAndPrintQueue(new Command("It is num1"));
        addAndPrintQueue.addAndPrintQueue(new Command("It is num2"));
        addAndPrintQueue.addAndPrintQueue(new Command("It is num3"));
        addAndPrintQueue.addAndPrintQueue(new Command("It is num4"));
        addAndPrintQueue.addAndPrintQueue(new Command("It is num5"));


        Queue<Command> commands = addAndPrintQueue.getQueue();

        for (Command c : commands)
            c.operation();

    }
}
