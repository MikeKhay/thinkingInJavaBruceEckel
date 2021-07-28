package chapter15.generics.task27;


import java.util.ArrayList;
import java.util.Arrays;

public class ListsCovariance {
    public static void main(String[] args) {
//        ArrayList<Number> list = new ArrayList<Integer>();

        ArrayList<? extends Number> list2 = new ArrayList<Integer>();
//        list2.add(7656);

        ArrayList<? extends Number> list3 = new ArrayList<>(Arrays.asList(new Integer[]{2,6,3,8,1,4,2,3}));
        System.out.println(list3);
    }
}
