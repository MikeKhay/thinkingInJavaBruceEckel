package chapter17.containers.task9;

import java.util.Random;

public class RandomGenerator {

    private static Random r = new Random();

    public static class Character implements Generator<java.lang.Character> {

        @Override
        public java.lang.Character next() {
            return (char)((int) 'a' + r.nextInt(26));
        }
    }

    public static class String implements Generator<java.lang.String> {

        private static final Generator<java.lang.Character> charGen = new Character();
        private int length = 7;

        public String() {
        }

        public String(int length) {
            this.length = length;
        }

        @Override
        public java.lang.String next() {
            char[] charArray = new char[length];
            for (int i = 0; i < length; i++){
                charArray[i] = charGen.next();
            }
            return new java.lang.String(charArray);
        }
    }
}
