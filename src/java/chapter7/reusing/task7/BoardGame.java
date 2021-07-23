package chapter7.reusing.task7;

public class BoardGame extends Game {
    public int a;

    BoardGame(int i, int a) {
        super(i);
        this.a = a;
        System.out.println("Constructor BoardGame");
    }
}
