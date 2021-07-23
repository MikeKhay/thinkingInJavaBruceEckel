package chapter2.object.task9;

public class App {
    public static void main(String[] args) {

        int i = 47;
        Integer aInteger = i;

        double d = 567.464;
        Double aDouble = d;

        char c = 'q';
        Character aCharacter = c;



        System.out.println("int == Integer : " + (i == aInteger));
        System.out.println("double == Double : " + (d == aDouble));
        System.out.println("char == Character : " + (c == aCharacter));


    }
}
