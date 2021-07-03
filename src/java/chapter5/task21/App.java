package chapter5.task21;

public class App {
    public static void main(String[] args) {
        for (Money m: Money.values()) {
            System.out.println("Name money : " + m + " . Ordinal : " + m.ordinal());
        }
    }
}
