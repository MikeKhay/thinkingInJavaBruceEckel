package chapter8.polymorphism.task3;

public class Triangle extends Shape {
    @Override
    public void draw(){
        System.out.println("Triangle.draw");
    }
    @Override
    public void erase(){
        System.out.println("Triangle.erase");
    }
    public void redraw() {
        System.out.println("Redraw Triangle");
    }
}
