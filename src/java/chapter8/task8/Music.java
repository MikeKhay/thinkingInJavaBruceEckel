package chapter8.task8;

public class Music {
    private static RandomInstrumentGenerator randomInstrumentGenerator = new RandomInstrumentGenerator();
    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[27];

        for (int i = 0; i < instruments.length; i++){
            instruments[i] = randomInstrumentGenerator.next();
        }

        for (Instrument i : instruments) {
            i.play(Note.B_FLAT);
        }

    }
}
