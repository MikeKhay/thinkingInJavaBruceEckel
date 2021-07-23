package chapter11.collections.task14;

import java.util.LinkedList;
import java.util.ListIterator;

public class addElementInLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < 30; i++){
            getListIterator(list).add(i);
        }

        System.out.println(list);

    }
    public static ListIterator<Integer> getListIterator(LinkedList<Integer> list){
        return list.listIterator(list.size()/2);
    }
}
