package chapter16.arrays.task22;

import java.util.Comparator;

public class CompAnimal implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return (a1.getId() < a2.getId() ? -1 : (a1.getId() == a2.getId() ? 0 : 1));
    }
}
