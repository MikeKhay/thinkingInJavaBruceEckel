package chapter8.task16;

public class Glyph {

    void draw(){
        System.out.println("Glyph");
    }

    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
