package chapter8.task6;

public class Instrument extends Object{
    void play(Note n){
        System.out.println("Instrument.play() " + n);
    }
    String what(){
        return "Instrument";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return what();
    }
}
