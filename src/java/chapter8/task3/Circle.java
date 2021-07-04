package chapter8.task3;

public class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("Circle.draw");
    }
    @Override
    public void erase(){
        System.out.println("Circle.erase");

    }

    public void redraw() {
        System.out.println("Redraw Circle");
    }
}
