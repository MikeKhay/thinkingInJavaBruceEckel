package chapter10.task5;

public class Outer {

    public class Inner{
        private String text;

        public Inner(String text) {
            this.text = text;
        }

        public void getText(){
            System.out.println(text);
        }

    }
}
