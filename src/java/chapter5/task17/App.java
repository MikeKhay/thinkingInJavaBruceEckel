package chapter5.task17;

public class App {
    public static void main(String[] args) {

        GetString[] getStringArray = new GetString[5];

//        getStringArray[3] = new GetString("I am string");

        for (GetString g: getStringArray) {
            System.out.println(g);
        }
    }
}
