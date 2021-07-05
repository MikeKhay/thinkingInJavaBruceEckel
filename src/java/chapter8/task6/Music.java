package chapter8.task6;

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

        Woodwind woodwind = new Woodwind();
        System.out.println(woodwind.toString());

        Instrument instrument = new Instrument();
        System.out.println(instrument.toString());
    }
}
