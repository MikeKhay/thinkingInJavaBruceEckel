package chapter9.interfaces.task9;

abstract class Instrument {
    void play(Note n){
        System.out.println("Instrument.play() " + n);
    }
    String what(){
        return "Instrument";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }

}
