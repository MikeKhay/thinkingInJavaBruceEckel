package chapter12.task20;

public class StormyInning extends Inning implements Storm {
    public StormyInning() throws RainedOut,BaseballException {}

    public StormyInning(String s) throws RainedOut, BaseballException {}

    public void walk() throws PopFoul {}

//    public void event() throws RainedOut {}

    @Override
    public void atBat() throws PopFoul {

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    public void event() {}

    public void callUmpireException() throws UmpireException {}

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.callUmpireException();
        }
        catch (PopFoul e){
            System.out.println("Pop foul");
        }
        catch (RainedOut e) {
            System.out.println("Rained out");
        }
        catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        } catch (UmpireException e) {
            System.out.println("Umpire Exception");
        }

        try{
            Inning i = new StormyInning();
            i.atBat();
        }
        catch (Strike e){
            System.out.println("Strike");
        }
        catch (Foul e){
            System.out.println("Foul");
        }
        catch (RainedOut e){
            System.out.println("RainedOut");
        }
        catch (BaseballException e){
            System.out.println("General exception");
        }
    }
}
