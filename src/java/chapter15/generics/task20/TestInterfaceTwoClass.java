package chapter15.generics.task20;

public class TestInterfaceTwoClass{
    public static <T extends TestInterfaceClass> void sayWhereAreYou(T t){
        t.sayHello("Mike");
        t.sayHowAreYou("Mike");
        t.sayGoodBuy("Mike");
    }
}
