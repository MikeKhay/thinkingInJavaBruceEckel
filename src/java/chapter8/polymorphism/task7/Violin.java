package chapter8.polymorphism.task7;

public class Violin extends Stringed {
    void play(Note n){
        System.out.println("Violin.play() " + n);
    }
    String what(){
        return "Violin";
    }
    void adjust(){
        System.out.println("Adjusting Violin");
    }
}
