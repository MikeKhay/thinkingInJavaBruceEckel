package chapter14.typeInfo.task21;

public class SimpleProxyDemo {
    public static void consumer(Interface i){
        i.doSomething();
        i.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        System.out.println();
        consumer(new SimpleProxy(new RealObject()));
        System.out.println();
        SimpleProxy.showCount();
    }
}
