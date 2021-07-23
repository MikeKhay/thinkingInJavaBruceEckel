package chapter9.interfaces.task10;

public class Brass extends Wind implements Playable{
    public void play(Note n){
        System.out.println("Brass.play() " + n);
    }
    void adjust(){
        System.out.println("Adjusting Brass");
    }
}
