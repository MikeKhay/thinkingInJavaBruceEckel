package chapter8.task4;

public class Square extends Shape {
    @Override
    public void draw(){
        System.out.println("Square.draw");
    }
    @Override
    public void erase(){
        System.out.println("Square.erase");
    }

    public void redraw() {
        System.out.println("Redraw Square");
    }
}
