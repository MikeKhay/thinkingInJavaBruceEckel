package chapter12.task23;

public class MethodDispose {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose(){
        System.out.println("NeedsCleanup " + id + " liberated.");
    }
}
