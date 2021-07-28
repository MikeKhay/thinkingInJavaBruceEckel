package chapter15.generics.task20;

public class TestInterfaceClass implements TestInterface {

    public void sayHowAreYou(String name){
        System.out.println("How are you " + name + "?");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    @Override
    public void sayGoodBuy(String name) {
        System.out.println("Good buy " + name);
    }
}
