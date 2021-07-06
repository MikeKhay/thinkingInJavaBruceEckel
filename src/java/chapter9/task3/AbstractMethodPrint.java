package chapter9.task3;

public abstract class AbstractMethodPrint {

    AbstractMethodPrint(){
        System.out.println("ConstructorAbstractClass");
        print();
    }

    abstract void print();
}
