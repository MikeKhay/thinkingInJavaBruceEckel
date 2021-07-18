package chapter12.task20;

public interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
    public void callUmpireException() throws UmpireException;
}
