package chapter9.interfaces.task10;

public class Woodwind extends Wind {
    public void play(Note n){
        System.out.println("Woodwind.play() " + n);
    }
    String what(){
        return "Woodwind";
    }
}
