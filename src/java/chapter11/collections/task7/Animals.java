package chapter11.collections.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animals {
    public static void main(String[] args) {
        Animal[] a = {new Animal(24,"Dog"), new Animal(11, "Cat"), new Animal(16, "Bear")
                    , new Animal(7, "Manky"), new Animal(14, "Fish"), new Animal(9, "Mouse")};

        List<Animal> animalList = new ArrayList<>(Arrays.asList(a));
        for (Animal animal: animalList)
            System.out.println(animal.toString());

        System.out.println();
        animalList.subList(0,3).clear();

        for (Animal an : animalList)
            System.out.println(an.toString());

    }
}
