package chapter2.task8;

public class App {
    public static void main(String[] args) {

        StaticNumber staticNumber1 = new StaticNumber();
        StaticNumber staticNumber2 = new StaticNumber();
        StaticNumber staticNumber3 = new StaticNumber();

        System.out.println(staticNumber1.i);
        System.out.println(staticNumber2.i);
        System.out.println(staticNumber3.i);
        System.out.println();

        staticNumber1.i++;
        staticNumber3.i++;


        System.out.println(staticNumber1.i);
        System.out.println(staticNumber2.i);
        System.out.println(staticNumber3.i);

    }
}
