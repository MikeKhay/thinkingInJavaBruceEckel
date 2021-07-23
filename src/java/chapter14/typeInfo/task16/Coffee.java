package chapter14.typeInfo.task16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString(){
        return getClass().getSimpleName() + " " + id;
    }

    public Coffee() {
    }

    static List<CreateCoffee<? extends Coffee>> createCoffees = new ArrayList<>();

    static {
        createCoffees.add(new Americano.CreateCoffee());
        createCoffees.add(new Breve.CreateCoffee());
        createCoffees.add(new Cappuccino.CreateCoffee());
        createCoffees.add(new Latte.CreateCoffee());
        createCoffees.add(new Mocha.CreateCoffee());
    }

    private static Random rand = new Random(47);
    public static Coffee createRandom(){
        int n = rand.nextInt(createCoffees.size());
        return createCoffees.get(n).create();
    }
}
