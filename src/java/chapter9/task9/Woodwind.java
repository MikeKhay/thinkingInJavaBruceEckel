package chapter9.task9;

public class Woodwind extends Wind {
    void play(Note n){
        System.out.println("Woodwind.play() " + n);
    }
    String what(){
        return "Woodwind";
    }
}
