package chapter10.innerClasses.task5;

public class App {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner("Hello guy");
        inner.getText();
    }
}
