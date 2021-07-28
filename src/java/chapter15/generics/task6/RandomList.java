package chapter15.generics.task6;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> list = new ArrayList<>();


    private Random random = new Random(47);

    public void add(T item){
        list.add(item);
    }

    public Object select(){
        return list.get(random.nextInt(list.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for(String s : "The quick brown fox jumped over the lazy brown dog".split(" "))
            rs.add(s);
        for (int i = 0; i < 10; i++)
            System.out.println(rs.select() + " ");
        System.out.println();

        RandomList<Double> doubleRandomList = new RandomList<>();
        for (int j = 0; j < 15; j++)
            doubleRandomList.add(j*1.37);
        for (int i = 0; i < 10; i++)
            System.out.println(doubleRandomList.select() + " ");
        System.out.println();

        RandomList<Integer> integerRandomList = new RandomList<>();
        for (int k = 0; k < 15; k++)
            integerRandomList.add(k*3);
        for (int i = 0; i < 10; i++)
            System.out.println(integerRandomList.select() + " ");
        System.out.println();
    }
}
