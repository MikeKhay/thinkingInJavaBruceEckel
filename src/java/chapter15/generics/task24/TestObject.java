package chapter15.generics.task24;

public class TestObject {
    private static int count = 0;
    private int id = ++count;

    public String toString(){
        return "TestObject : " + id;
    }

    public static Factory<TestObject> factory = new Factory<TestObject>() {
        @Override
        public TestObject create() {
            return new TestObject();
        }
    };
}
