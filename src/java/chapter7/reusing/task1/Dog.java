package chapter7.reusing.task1;

public class Dog {
    private String d;
    Dog(){
        System.out.println("Dog()");
        d = "Constructed";
    }

    @Override
    public String toString() {
        return d;
    }
}
