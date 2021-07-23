package chapter11.collections.task30;

import java.util.Iterator;

public class CollectionSequence {
    private Pet[] pets = {new Pet(1,"Dog"), new Pet(0, "Cat"), new Pet(3, "Fish"), new Pet(2, "Mouse")};
    public Iterator<Pet> iterator(){
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        PrintCollection.display(c.iterator());
    }
}
