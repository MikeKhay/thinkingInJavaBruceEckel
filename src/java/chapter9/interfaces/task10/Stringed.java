package chapter9.interfaces.task10;

public class Stringed extends Instrument implements Playable{
    public void play(Note n){
        System.out.println("Stringed.play() " + n);
    }
    String what(){
        return "Stringed";
    }
    void adjust(){
        System.out.println("Adjusting Stringed");
    }
}
