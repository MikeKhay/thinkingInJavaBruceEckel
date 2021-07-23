package chapter11.collections.task5;

import java.util.*;

public class ListInteger {
    public static void main(String[] args) {
        Random random = new Random(47);

        List<Integer> list = new ArrayList<>(Arrays.asList(6,3,8,9,2,4,7));
        System.out.println("1 : " + list);
        list.add(5);
        System.out.println("2 : " + list);
        System.out.println("3 : " + list.contains(5));
        list.remove(5);
        Integer i = list.get(2);
        System.out.println("4 : " + i + "   " + list.indexOf(i));
        Integer j = 1;
        System.out.println("5 : " + list.indexOf(j));
        System.out.println("6 : " + list.remove(j));
        System.out.println("7 : " + list.remove(i));
        System.out.println("8 : " + list);
        list.add(3,11);
        System.out.println("9 : " + list);
        List<Integer> list1 = new ArrayList<>(Arrays.asList(19,13,16));
        System.out.println("Several elements : " + list1);
        System.out.println("10 : " + list.containsAll(list1));
        Collections.sort(list1);
        System.out.println("Sorted list : " + list1);
        System.out.println("11 : " + list.containsAll(list1));
        Collections.shuffle(list1, random);
        System.out.println("After shuffle : " + list1);
        System.out.println("12 : " + list.containsAll(list1));
        List<Integer> copy = new ArrayList<Integer>(list);
        copy.retainAll(list1);
        System.out.println("13 : " + copy);
        copy = new ArrayList<Integer>(list);
        copy.remove(3);
        System.out.println("14 : " + copy);
        copy.remove(list1);
        System.out.println("15 : " + copy);
        copy.set(2, 14);
        System.out.println("16 : " + copy);
        copy.addAll(2, list1);
        System.out.println("17 : " + copy);
        System.out.println("18 : " + list.isEmpty());
        list.clear();
        System.out.println("19 : " + list);
        System.out.println("20 : " + list.isEmpty());
        list.addAll(Arrays.asList(7,4,0,1,3,2));
        System.out.println("21 : " + list);
        Object[] o = list.toArray();
        System.out.println("22 : " + o[1]);
        Integer[] integers = list.toArray(new Integer[5]);
        System.out.println("23 : " + integers[3]);
    }
}
