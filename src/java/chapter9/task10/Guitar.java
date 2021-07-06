package chapter9.task10;

public class Guitar extends Stringed implements Playable{
    public void play(Note n){
        System.out.println("Guitar.play() " + n);
    }
    String what(){
        return "Guitar";
    }
    void adjust(){
        System.out.println("Adjusting Guitar");
    }
}
