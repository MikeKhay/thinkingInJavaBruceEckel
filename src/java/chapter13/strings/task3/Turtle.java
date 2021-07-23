package chapter13.strings.task3;

import java.util.Formatter;

public class Turtle {
    private String name;
    private Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y){
        f.format("%s The Turtle is at (%d, %d)\n", name, x, y);
    }

    public static void main(String[] args) {
        Turtle t = new Turtle("Tur", new Formatter(System.err));
        t.move(0,0);
        t.move(3,7);
        t.move(6,4);
        t.move(2,3);
    }
}
