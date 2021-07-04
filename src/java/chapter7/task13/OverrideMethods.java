package chapter7.task13;

public class OverrideMethods {

    void overrideMethod(int i){
        System.out.println("I = " + i);
    }

    void overrideMethod(int i, int a){
        System.out.println("I = " + i);
        System.out.println("A = " + a);
    }

    void overrideMethod(int i, int a, int y){
        System.out.println("I = " + i);
        System.out.println("A = " + a);
        System.out.println("Y = " + y);
    }
}
