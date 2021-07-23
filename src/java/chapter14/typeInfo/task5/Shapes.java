package chapter14.typeInfo.task5;

import static chapter14.typeInfo.task5.Shape.rotate;

public class Shapes {
    public static void main(String[] args) {

        Shape shapeRhomboid = new Rhomboid();
        rotate(shapeRhomboid);

        Shape shapeCircle = new Circle();
        rotate(shapeCircle);

    }
}
