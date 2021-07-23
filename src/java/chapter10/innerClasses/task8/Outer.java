package chapter10.innerClasses.task8;

public class Outer {
    public class Inner{
        private String text = "Mike";
        private void getText(){
            System.out.println("Hi.");
        }
    }

//    String outerText = text;
    public void getPrivateMethodInner() {
        Inner inner1 = new Inner();
        System.out.println(inner1.text);
        inner1.getText();
    }

}
