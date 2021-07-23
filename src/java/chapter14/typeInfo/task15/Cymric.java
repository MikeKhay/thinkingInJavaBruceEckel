package chapter14.typeInfo.task15;

public class Cymric extends Manx {
    public Cymric() {
    }

    public Cymric(String name) {
        super(name);
    }

    public static class PetCreate implements chapter14.typeInfo.task15.PetCreate<Cymric> {
        @Override
        public Cymric create() {
            return new Cymric();
        }
    }

}
