package chapter14.typeInfo.task21;

public class SimpleProxy implements Interface {

    private Interface proxy;

    public static long doSomethingCount = 0;
    public static long somethingElseCount = 0;

    public SimpleProxy(Interface proxy){
        this.proxy = proxy;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxy.doSomething();
        doSomethingCount++;
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxy.somethingElse(arg);
        somethingElseCount++;
    }

    public static void showCount(){
        System.out.println("Method doSomething() called : " + doSomethingCount + " times.");
        System.out.println("Method somethingElse() called : " + somethingElseCount + " times.");
    }
}
