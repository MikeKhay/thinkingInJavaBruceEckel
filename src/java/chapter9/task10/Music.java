package chapter9.task10;


public class Music {

    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e){
        for (Instrument i:e) {
            tune(i);
        }
    }

    public static void main(String[] args) {

        Instrument[] orchestra = {
                new Brass(),
                new Guitar(),
                new Percussion(),
                new Stringed(),
                new Violin(),
                new Wind(),
                new Woodwind()
        };

        Music.tuneAll(orchestra);
    }
}
