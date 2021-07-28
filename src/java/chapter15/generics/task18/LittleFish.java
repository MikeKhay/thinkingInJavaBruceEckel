package chapter15.generics.task18;

public class LittleFish {
    private static long counter = 1;
    private final long id = counter++;

    private LittleFish(){}

    public static Generator<LittleFish> generator(){
        return new Generator<LittleFish>() {
            @Override
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }

    @Override
    public String toString() {
        return "LittleFish{" +
                "id=" + id +
                '}';
    }
}
