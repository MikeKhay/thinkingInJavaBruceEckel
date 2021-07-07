package chapter9.task19;

public class Games {
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        while (s.toss());
    }
}
