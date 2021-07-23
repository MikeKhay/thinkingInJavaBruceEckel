package chapter9.interfaces.task10;

public class Percussion extends Instrument implements Playable{
    public void play(Note n){
        System.out.println("Percussion.play() " + n);
    }
    String what(){
        return "Percussion";
    }
    void adjust(){
        System.out.println("Adjusting Percussion");
    }
}
