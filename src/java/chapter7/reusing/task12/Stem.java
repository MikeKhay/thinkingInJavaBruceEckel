package chapter7.reusing.task12;

public class Stem extends Root {
    public Stem() {
        System.out.println("Constructor Stem");
    }

    Component1 c1 = component1;
    Component2 c2 = component2;
    Component3 c3 = component3;

    void dispose(){
        System.out.println("Stem.dispose");
        c1.dispose();
        c2.dispose();
        c3.dispose();
    }

}
