package chapter7.task11;

public class App {
    public static void main(String[] args) {

        DetergentDelegation detergentDelegation = new DetergentDelegation("Detergent GOOD");
        detergentDelegation.apply();
        detergentDelegation.foam();
        detergentDelegation.scrub();
    }
}
