package chapter14.typeInfo.task3;

public class Shapes {
    public static void main(String[] args) {

        Shape shape = new Rhomboid();

        Rhomboid rhomboid = (Rhomboid) shape;
        rhomboid.draw();
        System.out.println(rhomboid.toString());

        Circle circle = (Circle) shape;
        circle.draw();
        System.out.println(circle.toString());
    }
}
