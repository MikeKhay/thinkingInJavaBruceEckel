package chapter9.interfaces.task10;

public class Violin extends Stringed implements Playable{
    public void play(Note n){
        System.out.println("Violin.play() " + n);
    }
    String what(){
        return "Violin";
    }
    void adjust(){
        System.out.println("Adjusting Violin");
    }
}
