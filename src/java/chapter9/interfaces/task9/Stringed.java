package chapter9.interfaces.task9;

public class Stringed extends Instrument {
    void play(Note n){
        System.out.println("Stringed.play() " + n);
    }
    String what(){
        return "Stringed";
    }
    void adjust(){
        System.out.println("Adjusting Stringed");
    }
}
