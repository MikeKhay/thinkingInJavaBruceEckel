package chapter16.arrays.task16;

import java.util.Arrays;

public class TestArrayGeneration {
    public static void main(String[] args) {

        int size = 10;
        SkipGenerator sg = new SkipGenerator();

        boolean[] a1 = ConvertTo.primitive(Generated.array(Boolean.class, sg.new Boolean(), size));
        System.out.println("a1 = " + Arrays.toString(a1));

        byte[] a2 = ConvertTo.primitive(Generated.array(Byte.class, sg.new Byte(), size));
        System.out.println("a2 = " + Arrays.toString(a2));

        char[] a3 = ConvertTo.primitive(Generated.array(Character.class, sg.new Character(), size));
        System.out.println("a3 = " + Arrays.toString(a3));

        short[] a4 = ConvertTo.primitive(Generated.array(Short.class, sg.new Short(), size));
        System.out.println("a4 = " + Arrays.toString(a4));

        int[] a5 = ConvertTo.primitive(Generated.array(Integer.class, sg.new Integer(), size));
        System.out.println("a5 = " + Arrays.toString(a5));

        long[] a6 = ConvertTo.primitive(Generated.array(Long.class, sg.new Long(), size));
        System.out.println("a6 = " + Arrays.toString(a6));

        float[] a7 = ConvertTo.primitive(Generated.array(Float.class, sg.new Float(), size));
        System.out.println("a7 = " + Arrays.toString(a7));

        double[] a8 = ConvertTo.primitive(Generated.array(Double.class, sg.new Double(), size));
        System.out.println("a8 = " + Arrays.toString(a8));
    }
}
