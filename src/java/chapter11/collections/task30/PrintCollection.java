package chapter11.collections.task30;

import java.util.Iterator;

public class PrintCollection {
    public static void display(Iterator<Pet> it){
        while(it.hasNext()) {
            Pet p = it.next();
            System.out.println(p.id + " : " + p.type);
        }
        System.out.println();
    }
}
