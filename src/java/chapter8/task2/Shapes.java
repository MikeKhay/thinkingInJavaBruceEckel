package chapter8.task2;

public class Shapes {

    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();

    public static void main(String[] args) {

        Shape[] s = new Shape[15];
        for (int i = 0; i < s.length; i++) {
            s[i] = randomShapeGenerator.next();
        }

        for (Shape shape: s) {
            shape.draw();
        }



    }
}
