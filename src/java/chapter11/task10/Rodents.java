package chapter11.task10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rodents {
    public static void main(String[] args) {

        List<Rodent> rodentList = new ArrayList<>();
        rodentList.add(new Mouse());
        rodentList.add(new Hamster());
        rodentList.add(new Beaver());

        Iterator<Rodent> rodentIterator = rodentList.iterator();
        while (rodentIterator.hasNext()){
            Rodent rodent = rodentIterator.next();
            rodent.eat();
            rodent.move();
        }
    }
}
