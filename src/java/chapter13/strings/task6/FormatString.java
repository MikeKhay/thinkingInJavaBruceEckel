package chapter13.strings.task6;

import java.util.Formatter;

public class FormatString {
    private int i;
    private long l;
    private float f;
    private double d;

    public FormatString(int i, long l, float f, double d) {
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    Formatter a = new Formatter();
    StringBuilder stringBuilder = new StringBuilder();




    @Override
    public String toString() {
        return String.format("FormatString = {i: %20d, l: %20d, f: %20.3f, d: %20.5f\n",i,l,f,d);
    }
}
