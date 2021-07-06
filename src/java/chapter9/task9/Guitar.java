package chapter9.task9;

public class Guitar extends Stringed {
    void play(Note n){
        System.out.println("Guitar.play() " + n);
    }
    String what(){
        return "Guitar";
    }
    void adjust(){
        System.out.println("Adjusting Guitar");
    }
}
