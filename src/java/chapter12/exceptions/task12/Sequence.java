package chapter12.exceptions.task12;

import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;

public class Sequence {
    private int id;

    public Sequence(int id) {
        this.id = id;
    }

    public static void controlSize(List list){
        if(list.size()>=7){
            try {
                throw new TooManyListenersException();
            } catch (TooManyListenersException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        List<Sequence> list = new ArrayList<>();

        for(int i = 0; i < 7; i++) {
            list.add(new Sequence(i));
            controlSize(list);
        }

        for (Sequence s: list)
            System.out.println(s.id);
    }
}
