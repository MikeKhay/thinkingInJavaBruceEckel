package chapter16.arrays.task13;

public class CountingGenerator {
    static char[] chars = ("abcdefghijklmnopqrstuvwxyz").toCharArray();

    public static class Character implements Generator<java.lang.Character>{

        int index = -1;

        @Override
        public java.lang.Character next() {
            index = (index + 1 % chars.length);
            return chars[index];
        }
    }
}
