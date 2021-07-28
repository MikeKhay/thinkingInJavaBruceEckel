package chapter15.generics.task23;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Creator extends GenericWithCreate<List<Integer>> {

    private Random random = new Random(47);

    @Override
    protected List<Integer> create() {
        return null;
    }

    @Override
    List<Integer> create(int size) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < size; i++)
            list.add(new Integer(random.nextInt(1000)));
        return list;
    }
}
