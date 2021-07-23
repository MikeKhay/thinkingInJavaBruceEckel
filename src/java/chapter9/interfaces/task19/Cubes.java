package chapter9.interfaces.task19;

public class Cubes implements Game {

    private int toss = 0;
    private static final int TOSS = 10;
    @Override
    public boolean toss() {
        System.out.println("Cubes toss " + toss);
        return ++toss != TOSS;
    }
}
