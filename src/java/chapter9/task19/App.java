package chapter9.task19;

public class App {
    public static void main(String[] args) {
        Games.playGame(new CoinsFactory());
        System.out.println();
        Games.playGame(new CubesFactory());
    }
}
