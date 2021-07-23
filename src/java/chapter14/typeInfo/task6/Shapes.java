package chapter14.typeInfo.task6;

import java.util.Arrays;
import java.util.List;

public class Shapes {
    public static void main(String[] args) {

        List<Shape> shapeList = Arrays.asList(new Triangle(), new Square(), new Rhomboid(), new Circle());
        for (Shape shape : shapeList){
            highLight(shape);
            shape.draw();
            if (shape instanceof Rhomboid){
                Rhomboid rhomboid = (Rhomboid) shape;
                System.out.println(rhomboid.toString());
            }
        }

    }

    static void highLight(Shape shape){
        shape.setHighLight(true);
    }
}
