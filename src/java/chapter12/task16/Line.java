package chapter12.task16;

public class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Draw Line : " + start + ", " + end);
    }
    void dispose(){
        System.out.println("Rubber Line : " + start + ", " + end);
        super.dispose();
    }
}
