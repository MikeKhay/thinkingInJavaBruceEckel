package chapter8.polymorphism.task16;

public class RectangularGlyph extends Glyph {
    private int sizeSide = 1;

    RectangularGlyph(int s){
        sizeSide = s;
        System.out.println("RectangularGlyph.RectangularGlyph(), sizeSide = " + sizeSide);
    }

    void draw(){
        System.out.println("RectangularGlyph.draw(), sizeSide = " + sizeSide);
    }
}
