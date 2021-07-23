package chapter12.exceptions.task16;

public class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Draw Circle");
    }
    void dispose(){
        System.out.println("Rubber Circle");
        super.dispose();
    }
}
