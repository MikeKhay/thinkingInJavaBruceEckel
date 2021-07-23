package chapter12.exceptions.task23;

public class MethodDispose {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose(){
        System.out.println("NeedsCleanup " + id + " liberated.");
    }
}
