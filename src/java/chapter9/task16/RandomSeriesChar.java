package chapter9.task16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomSeriesChar implements Readable{

    private static Random rand = new Random(47);
    private static final char[] arrayChar = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private int count;

    public RandomSeriesChar(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer charBuffer) throws IOException {
        if(count-- == 0)
            return -1;
        charBuffer.append(arrayChar[rand.nextInt(arrayChar.length)]);
        for (int i = 0; i < 20; i++){
            charBuffer.append(arrayChar[rand.nextInt(arrayChar.length)]);
        }

        charBuffer.append(" ");

        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomSeriesChar(5));
        while (s.hasNext())
            System.out.println(s.next());
    }
}
