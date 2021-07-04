package chapter7.task13;

public class App {
    public static void main(String[] args) {

        OverrideMethodsExtends overrideMethodsExtends = new OverrideMethodsExtends();
        overrideMethodsExtends.overrideMethod(1);
        System.out.println();
        overrideMethodsExtends.overrideMethod(1,2);
        System.out.println();
        overrideMethodsExtends.overrideMethod(1,2,3);
        System.out.println();
        overrideMethodsExtends.overrideMethod(1,2,3,4);
    }
}
