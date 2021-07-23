package chapter7.reusing.task11;

public class DetergentDelegation {

    private String name;
    private Detergent control = new Detergent();

    public DetergentDelegation(String name) {
        this.name = name;
    }

    public void apply(){
        control.apply();
    }

    public void scrub(){
        control.scrub();
    }

    public void foam(){
        control.foam();
    }
}
