package chapter4.task18;

public class App {
    public static void main(String[] args) {

//        for (int i = 1; i < 100; i++){
//            for (int j = 2; j < i; j++){
//                    if (i % j == 0) {
////                        System.out.println("The number is not divisible : " + i);
//                        System.out.println("Num i : " + i + " . Num j : " + j +" . % = " + (i % j));
//                    }
//            }
//        }

        for (int i = 2; i <= 100; i++){
            int count = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i + " ");
            }
        }

    }
}
