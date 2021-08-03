package chapter16.arrays.task16;

public class SkipGenerator {

    private int size =1;

    public SkipGenerator() {
    }

    public SkipGenerator(int size) {
        this.size = size;
    }

    public class Boolean implements Generator<java.lang.Boolean>{
        private boolean value = false;
        @Override
        public java.lang.Boolean next() {
            if(size % 2 == 1){
                value =! value;
            }
            return value;
        }
    }

    public class Byte implements Generator<java.lang.Byte>{
        private byte value = 0;
        @Override
        public java.lang.Byte next() {
            value += size;
            return value;
        }
    }

    static char[] chars = ("abcdefghijklmnopqrstuvwxyz").toCharArray();
    public class Character implements Generator<java.lang.Character>{
        int index = -1;
        @Override
        public java.lang.Character next() {
            return chars[(index + size) % chars.length];
        }
    }

    public class String implements Generator<java.lang.String>{
        private int length = 7;
        Generator<java.lang.Character> cg = new Character();
        public String(){}
        public String(int size){
            length = size;
        }
        @Override
        public java.lang.String next() {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < length; i++){
                sb.append(cg.next());
            }
            return sb.toString();
        }
    }

    public class Short implements Generator<java.lang.Short>{
        private short value = 0;
        @Override
        public java.lang.Short next() {
            value += size;
            return value;
        }
    }

    public class Integer implements Generator<java.lang.Integer>{
        private int value = 0;
        @Override
        public java.lang.Integer next() {
            value += size;
            return value;
        }
    }

    public class Long implements Generator<java.lang.Long>{
        private long value = 0;
        @Override
        public java.lang.Long next() {
            value += size;
            return value;
        }
    }

    public class Float implements Generator<java.lang.Float> {
        private float value = 0;
        @Override
        public java.lang.Float next() {
            value += size;
            return value;
        }
    }

    public class Double implements Generator<java.lang.Double> {
        private double value = 0.0;
        @Override
        public java.lang.Double next() {
            value += size;
            return value;
        }
    }
}
