package chapter9.interfaces.task19;

public class CoinsFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Coins();
    }
}
