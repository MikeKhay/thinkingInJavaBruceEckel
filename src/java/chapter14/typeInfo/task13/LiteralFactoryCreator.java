package chapter14.typeInfo.task13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralFactoryCreator extends FactoryCreator {

    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Part>> allTypes = Collections.unmodifiableList(Arrays.asList(AirFilter.class,
            CabinAirFilter.class, FuelFilter.class, OilFilter.class, FanBelt.class, GeneratorBelt.class, PowerSteeringBelt.class));

    private static final List<Class<? extends Part>> types = allTypes.subList(allTypes.indexOf(AirFilter.class), allTypes.size());

    @Override
    public List<Class<? extends Part>> types() {
        return types;
    }
}
