package chapter8.polymorphism.task7;

public class Brass extends Wind {
    void play(Note n){
        System.out.println("Brass.play() " + n);
    }
    void adjust(){
        System.out.println("Adjusting Brass");
    }
}
