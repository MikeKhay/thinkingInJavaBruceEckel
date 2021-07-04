package chapter7.task18;

import java.util.Random;

public class FinalStaticObject {

    private static Random random = new Random(47);
    private final int i = random.nextInt(30);
    static final int A = random.nextInt(30);

    public static void main(String[] args) {
        FinalStaticObject f1 = new FinalStaticObject();
        System.out.println("Final1 : " + f1.i);
        System.out.println("Static final1 : " + f1.A);

        FinalStaticObject f2 = new FinalStaticObject();
        System.out.println("Final2 : " + f2.i);
        System.out.println("Static final2 : " + f2.A);

        FinalStaticObject f3 = new FinalStaticObject();
        System.out.println("Final3 : " + f3.i);
        System.out.println("Static final3 : " + f3.A);

        FinalStaticObject f4 = new FinalStaticObject();
        System.out.println("Final4 : " + f4.i);
        System.out.println("Static final4 : " + f4.A);





    }
}
