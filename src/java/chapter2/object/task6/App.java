package chapter2.object.task6;

public class App {
    public static void main(String[] args) {

        String a = "Hello World";

        Storage s = new Storage();

        System.out.println("Bytes need : " + s.storage(a));
    }
}
