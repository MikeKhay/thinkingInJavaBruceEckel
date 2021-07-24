package chapter14.typeInfo.task25.testCallSaveMethod;

public class ClassWithMethodDifferentProtected {

    public void publicMethod(){
        System.out.println("It is publicMethod()");
    }

    protected void protectedMethod(){
        System.out.println("It is protectedMethod()");
    }

    private void privateMethod(){
        System.out.println("It is privateMethod()");
    }
}
