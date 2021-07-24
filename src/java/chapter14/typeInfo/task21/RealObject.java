package chapter14.typeInfo.task21;

import java.util.Date;

public class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
        System.out.println(new Date());
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
        System.out.println(new Date());
    }
}
