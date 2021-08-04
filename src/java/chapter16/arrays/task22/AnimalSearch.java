package chapter16.arrays.task22;

import java.util.Arrays;

public class AnimalSearch {
    public static void main(String[] args) {
        Animal[] animals = {new Animal(), new Animal(), new Animal(), new Animal()};
        Animal[] animals2 = {new Animal(), new Animal(), new Animal(), new Animal(), new Animal(), new Animal(), new Animal(), new Animal(), new Animal(), new Animal()};

        System.arraycopy(animals, 0, animals2, 3, 4);
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(animals2));
        System.out.println(Arrays.binarySearch(animals2, animals2[5], new CompAnimal()));

        Arrays.sort(animals2, new CompAnimal());
        System.out.println("After sort:");
        System.out.println(Arrays.toString(animals2));
        System.out.println(Arrays.binarySearch(animals2, animals2[5], new CompAnimal()));

    }
}
