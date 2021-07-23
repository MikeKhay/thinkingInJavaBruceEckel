package chapter10.innerClasses.task7;

public class Outer {
    private String text = "It is a text with OuterClass";
    private void sayHello(){
        System.out.println("Hello.");
    }

    public void getText(){
        Inner inner = new Inner();
        inner.changeTextOuter();
    }

    public class Inner{
        public void changeTextOuter(){
            String changeTextOuter = "It is a text with InnerClass";
            text = changeTextOuter;
            System.out.println(text);
            Outer outer = new Outer();
            outer.sayHello();
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getText();
    }
}
