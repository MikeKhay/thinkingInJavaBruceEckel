package chapter14.typeInfo.task15;

public class EgyptianMau extends Cat {
    public EgyptianMau() {
    }

    public EgyptianMau(String name) {
        super(name);
    }

    public static class PetCreate implements chapter14.typeInfo.task15.PetCreate<EgyptianMau>{
        @Override
        public EgyptianMau create() {
            return new EgyptianMau();
        }
    }
}
