package chapter10.innerClasses.task6.package2;

import chapter10.innerClasses.task6.package1Interface.InterWithOneMethod;

public class Outer {
    protected class Inner implements InterWithOneMethod {
        private String text;

        public Inner(String text) {
            this.text = text;
        }

        @Override
        public void getText() {
            System.out.println(text);
        }
    }
}
