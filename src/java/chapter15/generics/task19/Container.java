package chapter15.generics.task19;

import java.util.Random;

public class Container {
    private final int id;
    private String color;

    public Container(int id, String color) {
        this.id = id;
        this.color = color;
    }

    public static Generator<Container> generator = new Generator<Container>() {
        String[] s = {"Red", "Green", "Blue", "Black", "Yellow", "Orange"};
        Random rand = new Random(47);
        @Override
        public Container next() {
            return new Container(rand.nextInt(1000), s[rand.nextInt(s.length)]);
        }
    };

    @Override
    public String toString() {
        return "Container{" +
                "id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
