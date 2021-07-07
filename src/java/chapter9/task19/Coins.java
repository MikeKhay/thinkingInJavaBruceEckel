package chapter9.task19;

public class Coins implements Game {

    private int toss = 0;
    private static final int TOSS = 7;

    @Override
    public boolean toss() {
        System.out.println("Coins toss " + toss);
        return ++toss != TOSS;
    }
}
