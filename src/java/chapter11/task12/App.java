package chapter11.task12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>(Arrays.asList("Mike", "Taras", "Ruslan"));
//
//        ListIterator<String> listIterator = list.listIterator(list.size());
//
//
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }

        List<Integer> list1 = new ArrayList<>(Arrays.asList(3,4,2,8,9,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6,5,9,3,2,1));

        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());

        while(listIterator1.hasPrevious()) {
            list2.add(listIterator1.previous());
        }

        for (Integer i: list2) {
            System.out.println(i);
        }
    }
}
