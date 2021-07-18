package chapter12.task16;

public class Triangle extends Shape{
    Triangle(int i) {
        super(i);
        System.out.println("Draw Triangle");
    }
    void dispose(){
        System.out.println("Rubber Triangle");
        super.dispose();
    }
}
