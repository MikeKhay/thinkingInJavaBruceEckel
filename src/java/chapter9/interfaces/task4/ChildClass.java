package chapter9.interfaces.task4;

public class ChildClass extends AbstractClassNotMethod {

    static void printMessage(AbstractClassNotMethod abstractClassNotMethod){
        ChildClass childClass = (ChildClass) abstractClassNotMethod;
        boolean b = (childClass == null);
        System.out.println("ChildClass == null : " + b);
    }

}
