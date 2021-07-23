package chapter9.interfaces.task10;

abstract class Instrument {
    String what(){
        return "Instrument";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }

    public abstract void play(Note middleC);
}
