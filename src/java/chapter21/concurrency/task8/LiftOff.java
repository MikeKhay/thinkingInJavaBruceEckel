package chapter21.concurrency.task8;

public class LiftOff extends Thread {
    protected int countDown = 10;
//    private static int taskCount = 0;
//    private final int id = taskCount++;
    private static int threadCount = 0;

    public LiftOff(){
        super(Integer.toString(++threadCount));
        setDaemon(true);
        start();
    }

    public String toString() {
        return "#" + getName() + "(" + countDown + "), ";
    }

    @Override
    public void run() {
        while(true) {
            System.out.println(this);
            if (--countDown == 0){
                return;
            }
        }
    }
}
