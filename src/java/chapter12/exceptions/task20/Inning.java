package chapter12.exceptions.task20;

public abstract class Inning {

    public Inning() throws BaseballException {}

    public void event() throws BaseballException, RainedOut {}

    public abstract void atBat() throws Strike, Foul;

    public void walk() throws PopFoul {}
}
