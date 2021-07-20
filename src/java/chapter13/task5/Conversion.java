package chapter13.task5;

import java.math.BigInteger;
import java.util.Formatter;

public class Conversion {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);

        char u = 'a';
        System.out.println("u = 'a'");
        f.format("s: %-5s\n", u);
        f.format("c: %6c\n", u);
        f.format("b: %4b\n", u);
        f.format("h: %-3h\n", u);
        System.out.println();

        int v = 121;
        System.out.println("v = 121");
        f.format("d: %-8d\n", v);
        f.format("c: %5c\n", v);
        f.format("b: %7b\n", v);
        f.format("s: %-6s\n", v);
        f.format("x: %9x\n", v);
        f.format("h: %h\n", v);
        System.out.println();

        BigInteger w = new BigInteger("500000000000000");
        System.out.println("w = new BigInteger(500000000000000)");
        f.format("d: %-5d\n", w);
        f.format("b: %7b\n", w);
        f.format("s: %-6s\n", w);
        f.format("x: %3x\n", w);
        f.format("h: %9h\n", w);
        System.out.println();

        double x = 179.543;
        System.out.println("x = 179.543");
        f.format("b: %b\n", x);
        f.format("s: %s\n", x);
        f.format("f: %f\n", x);
        f.format("e: %e\n", x);
        f.format("h: %h\n", x);
        System.out.println();

        Conversion y = new Conversion();
        System.out.println("y = new Conversion()");
        f.format("b: %b\n", y);
        f.format("s: %s\n", y);
        f.format("h: %h\n", y);
        System.out.println();

        boolean z = false;
        System.out.println("z = false");
        f.format("b: %b\n", z);
        f.format("s: %s\n", z);
        f.format("h: %h\n", z);




    }
}
