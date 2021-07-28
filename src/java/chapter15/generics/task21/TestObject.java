package chapter15.generics.task21;

public class TestObject {
    private static int count = 1;
    private int id = count++;

    public String toString(){
        return "TestObject# " + id;
    }
}
