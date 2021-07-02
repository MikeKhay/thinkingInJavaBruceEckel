package chapter3.task13;

public class App {
    public static void main(String[] args) {

        System.out.println(transformChar('7'));
        System.out.println(transformChar('d'));
        System.out.println(transformChar('4'));



    }
    static String transformChar(Character c){
        return Integer.toBinaryString(c);
    }
}
