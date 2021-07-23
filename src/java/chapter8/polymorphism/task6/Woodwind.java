package chapter8.polymorphism.task6;

public class Woodwind extends Wind{
    void play(Note n){
        System.out.println("Woodwind.play() " + n);
    }
    String what(){
        return "Woodwind";
    }

}
