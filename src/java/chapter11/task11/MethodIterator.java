package chapter11.task11;

import java.util.Collection;
import java.util.Iterator;

public class MethodIterator {
    public static void getPrintCollection(Collection collection){
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.print(o.toString() + ", ");
        }
    }
}
