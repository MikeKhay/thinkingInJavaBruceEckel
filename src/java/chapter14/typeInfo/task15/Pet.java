package chapter14.typeInfo.task15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pet {
    private String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public String toString(){
        return getClass().getSimpleName();
    }

    static List<PetCreate<? extends Pet>> petCreateList = new ArrayList<>();

    static {
        petCreateList.add(new Cymric.PetCreate());
        petCreateList.add(new EgyptianMau.PetCreate());
        petCreateList.add(new Gerbil.PetCreate());
        petCreateList.add(new Mutt.PetCreate());
        petCreateList.add(new Pug.PetCreate());
        petCreateList.add(new Rat.PetCreate());
    }

    private static Random rand = new Random(47);
    public static Pet createRandom(){
        int n = rand.nextInt(petCreateList.size());
        return petCreateList.get(n).create();
    }
}
