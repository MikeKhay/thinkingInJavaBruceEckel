package chapter10.task1;

public class Outer {
    class Inner{
        public String text;

        public Inner(String text) {
            this.text = text;
        }

        String textInner(){
            return text;
        }
    }

    public void printText(String s){
        Inner inner = new Inner(s);
        System.out.println(inner.textInner());
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.printText("Hi guy!!!");
    }
}
