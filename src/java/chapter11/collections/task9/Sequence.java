package chapter11.collections.task9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sequence {
    private int id;

    public Sequence(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        List<Sequence> list = new ArrayList<>();

        for(int i = 0; i < 10; i++)
            list.add(new Sequence(i));

        Iterator<Sequence> sequenceIterator = list.iterator();
        while (sequenceIterator.hasNext()){
            Sequence sequence = sequenceIterator.next();
            System.out.println(sequence.id);
        }
    }
}
