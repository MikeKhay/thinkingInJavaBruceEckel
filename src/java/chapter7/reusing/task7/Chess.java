package chapter7.reusing.task7;

public class Chess extends BoardGame {
    private int z;

    Chess(int i, int a, int z) {
        super(i, a);
        this.z = z;
        System.out.println("Constructor Chess");
    }

    public static void main(String[] args) {
        Chess chess = new Chess(15,10,5);

        System.out.println(chess.i);
        System.out.println(chess.a);
        System.out.println(chess.z);
    }
}
