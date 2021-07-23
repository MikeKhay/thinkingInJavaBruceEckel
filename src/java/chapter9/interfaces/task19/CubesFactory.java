package chapter9.interfaces.task19;

public class CubesFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Cubes();
    }
}
