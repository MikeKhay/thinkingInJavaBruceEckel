package chapter14.typeInfo.task12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralCoffeeCreator extends CoffeeCreator {

    @SuppressWarnings("unchecked")

    public static final List<Class<? extends Coffee>> allTypes = Collections.unmodifiableList(Arrays.asList(Americano.class,
            Breve.class, Cappuccino.class, Latte.class, Mocha.class));

    private static final List<Class<? extends Coffee>> types = allTypes.subList(allTypes.indexOf(Americano.class), allTypes.size());
    @Override
    public List<Class<? extends Coffee>> types() {
        return types;
    }
}
