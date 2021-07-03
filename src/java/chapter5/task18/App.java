package chapter5.task18;

public class App {
    public static void main(String[] args) {

        GetString[] getStringArray = new GetString[5];

        getStringArray[0] = new GetString("I am string0");
        getStringArray[1] = new GetString("I am string1");
        getStringArray[2] = new GetString("I am string2");
        getStringArray[3] = new GetString("I am string3");
        getStringArray[4] = new GetString("I am string4");

        for (GetString g: getStringArray) {
            System.out.println(g.toString());
        }
    }
}
