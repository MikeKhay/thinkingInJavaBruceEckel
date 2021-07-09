package chapter10.task3;

public class Outer {

    private String text;

    public Outer() {
        this.text = "Hello world";
    }

    private class Inner{
        public void getString(){
            System.out.println(text);
        }
    }

    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.getString();
    }
}
