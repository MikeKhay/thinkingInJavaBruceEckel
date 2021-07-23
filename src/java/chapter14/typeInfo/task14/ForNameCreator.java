package chapter14.typeInfo.task14;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends FactoryCreator{

    private static List<Class<? extends Part>> types = new ArrayList<>();

    private static String[] typeNames = {
            "chapter14.typeInfo.task14.AirFilter",
            "chapter14.typeInfo.task14.CabinAirFilter",
            "chapter14.typeInfo.task14.FanBelt",
            "chapter14.typeInfo.task14.FuelFilter",
            "chapter14.typeInfo.task14.GeneratorBelt",
            "chapter14.typeInfo.task14.OilFilter",
            "chapter14.typeInfo.task14.PowerSteeringBelt"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for(String name : typeNames)
                types.add((Class<? extends Part>)Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    @Override
    public List<Class<? extends Part>> types() {
        return types;
    }
}
