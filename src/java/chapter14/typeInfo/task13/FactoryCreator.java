package chapter14.typeInfo.task13;

import java.util.List;
import java.util.Random;

public abstract class FactoryCreator {
    private Random rand = new Random(47);

    public abstract List<Class<? extends Part>> types();

    public Part randomPart() {
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    public Part[] createArray(int size) {
        Part[] result = new Part[size];
        for (int i = 0; i < size; i++ )
            result[i] = randomPart();
        return result;
    }
}
