package chapter4.task20;

public class IfElse {
    public static void main(String[] args) {

        System.out.println(test(5,10,7));
        System.out.println(test(5,10,3));
        System.out.println(test(5,10,14));

    }

    static String test(int begin, int end, int testVal){
        if(testVal < begin){
            return "TestVal < begin";
        }
        else if (testVal > end){
            return "TestVal > end";
        }
        return "TestVal is good!";
    }
}
