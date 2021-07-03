package chapter4.task21;

public class BreakAndContinue {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++){
            if(i == 99) break;
            if(i % 9 != 0) continue;
            System.out.println(i);
            return;
        }
    }
}
