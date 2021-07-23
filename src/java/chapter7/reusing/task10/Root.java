package chapter7.reusing.task10;

public class Root {
    public Root() {
        System.out.println("Constructor Root");
    }

    Component1 component1 = new Component1("Value com1");
    Component2 component2 = new Component2("Value com2");
    Component3 component3 = new Component3("Value com3");


}
