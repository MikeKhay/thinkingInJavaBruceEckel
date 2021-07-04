package chapter7.task6;

public class Chess extends BoardGame {
    Chess(int i) {
        super(11);
        System.out.println("Constructor Chess");
    }

    public static void main(String[] args) {
        Chess chess = new Chess(15);
    }
}
