package chapter11.collections.task8;

import java.util.ArrayList;
import java.util.Iterator;

public class Gerbils {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilArrayList = new ArrayList<Gerbil>();
        gerbilArrayList.add(new Gerbil(1));
        gerbilArrayList.add(new Gerbil(2));
        gerbilArrayList.add(new Gerbil(3));
        gerbilArrayList.add(new Gerbil(4));
        gerbilArrayList.add(new Gerbil(7));


        Iterator<Gerbil> gerbilIterator = gerbilArrayList.iterator();
        while (gerbilIterator.hasNext()){
            Gerbil gerbil = gerbilIterator.next();
            gerbil.hop();
        }
    }
}
