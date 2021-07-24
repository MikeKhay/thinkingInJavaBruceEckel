package chapter14.typeInfo.task26;

public class Wind extends Instrument {
    void play(Note n){
        System.out.println("Wind.play() " + n);
    }
    String what(){
        return "Wind";
    }
    void adjust(){
        System.out.println("Adjusting Wind");
    }
    void clearSpitValve(){
        System.out.println(this.getClass().getSimpleName() + " is cleaning the spit valve.");
    }
}
