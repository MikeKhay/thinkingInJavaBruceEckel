package chapter13.strings.task20;

import java.util.Scanner;

public class BreakingString {
    private int i;
    private long l;
    private float f;
    private double d;
    private String s;

    public BreakingString(String string) {
        Scanner scanner = new Scanner(string);
        this.i = scanner.nextInt();
        this.l = scanner.nextLong();
        this.f = Float.valueOf(scanner.nextLine().trim());
        this.d = Double.valueOf(scanner.nextLine().trim());
        this.s = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "BreakingString{" +
                "i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", s='" + s + '\'' +
                '}';
    }
}
