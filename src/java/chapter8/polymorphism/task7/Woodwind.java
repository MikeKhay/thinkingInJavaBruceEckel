package chapter8.polymorphism.task7;

public class Woodwind extends Wind {
    void play(Note n){
        System.out.println("Woodwind.play() " + n);
    }
    String what(){
        return "Woodwind";
    }
}
