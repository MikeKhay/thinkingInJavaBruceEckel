package chapter11.collections.task15;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        int count = 0;

        for (String s : "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---".split("")){

            if ( s.equals("+")) {
                count++;
                System.out.println("+ to count = " + count);
            }
            else if ( s.equals("-")) {
                System.out.println("Delete with stack = " + stringStack.pop());
            }
            else if (0 < count) {
                System.out.println("Add to stack = " + stringStack.push(s));
                count--;
            }
        }



//        while (!stringStack.empty()){
//            System.out.println(stringStack.pop());
//        }
    }
}
