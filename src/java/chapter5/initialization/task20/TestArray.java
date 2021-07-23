package chapter5.initialization.task20;

public class TestArray {
    public static void main(String[] args) {
        mainArray(2,4,6,2,8,7,34,76,24,56,65,35,98,76,97,345);
        System.out.println();
        mainArray(2,4,6,2,8,7);

    }

    static void mainArray(Integer... args){
        for (Integer i : args) {
            System.out.print(i + ", ");
        }
    }
}
