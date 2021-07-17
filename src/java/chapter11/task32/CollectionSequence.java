package chapter11.task32;

import java.util.*;

public class CollectionSequence extends PetSequence {
    public Iterable<Pet> reversed(){
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = pets.length - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> petList = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(petList, new Random(7));
                return petList.iterator();
            }
        };
    }

    public static void main(String[] args) {

        CollectionSequence collectionSequence = new CollectionSequence();
        for(Pet p : collectionSequence.reversed())
            System.out.println(p);
        System.out.println();

        for (Pet pet : collectionSequence.randomized())
            System.out.println(pet);
    }
}
