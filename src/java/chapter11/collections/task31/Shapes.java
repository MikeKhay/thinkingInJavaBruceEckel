package chapter11.collections.task31;

import java.util.Arrays;

public class Shapes {

    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();

    public static void main(String[] args) {

        Shape[] s = new Shape[15];
        for (int i = 0; i < s.length; i++) {
            s[i] = randomShapeGenerator.next();
        }

        test(Arrays.asList(s));
    }

    public static <Shape> void test(Iterable<Shape> shapes){
        for (Shape s : shapes)
            System.out.println(s);
    }
}
