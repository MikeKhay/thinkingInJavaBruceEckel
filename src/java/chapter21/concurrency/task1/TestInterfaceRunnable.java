package chapter21.concurrency.task1;

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
        for (int i = 0; i < 5; i++){
            new Thread(new TestInterfaceRunnable()).start();
        }
    }
}
