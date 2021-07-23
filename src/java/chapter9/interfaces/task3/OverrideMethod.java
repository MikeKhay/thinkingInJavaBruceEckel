package chapter9.interfaces.task3;

public class OverrideMethod extends AbstractMethodPrint{

    int i = 5;

    @Override
    void print() {
        System.out.println("int i = " + i);
    }
}
