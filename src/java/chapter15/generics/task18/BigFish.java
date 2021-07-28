package chapter15.generics.task18;

public class BigFish {
    private static long counter = 1;
    private final long id = counter++;

    private BigFish(){}

    public static Generator<BigFish> generator = new Generator<BigFish>() {
        @Override
        public BigFish next() {
            return new BigFish();
        }
    };

    @Override
    public String toString() {
        return "BigFish{" +
                "id=" + id +
                '}';
    }
}
