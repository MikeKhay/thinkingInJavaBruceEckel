package chapter7.reusing.task16;

public class App {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.jump();
        frog.sit();
        frog.swimming();

        Amphibian amphibian = frog;
        amphibian.jump();
        amphibian.sit();
        amphibian.swimming();
    }
}
