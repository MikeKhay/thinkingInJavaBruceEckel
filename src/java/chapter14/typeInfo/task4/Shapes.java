package chapter14.typeInfo.task4;

public class Shapes {
    public static void main(String[] args) {

        Shape shape = new Rhomboid();

        if(shape instanceof Rhomboid){
            System.out.println("The object shape is an instance of the class Rhomboid");
        }
        else {
            System.out.println("The object shape is not an instance of the class Rhomboid");

        }

        Rhomboid rhomboid = (Rhomboid) shape;
        rhomboid.draw();
        System.out.println(rhomboid.toString());
    }
}
