package chapter9.interfaces.task10;

public class Wind extends Instrument implements Playable{
    public void play(Note n){
        System.out.println("Wind.play() " + n);
    }
    String what(){
        return "Wind";
    }
    void adjust(){
        System.out.println("Adjusting Wind");
    }
}
