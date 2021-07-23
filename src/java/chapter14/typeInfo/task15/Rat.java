package chapter14.typeInfo.task15;

public class Rat extends Rodent {
    public Rat() {
    }

    public Rat(String name) {
        super(name);
    }

    public static class PetCreate implements chapter14.typeInfo.task15.PetCreate<Rat>{
        @Override
        public Rat create() {
            return new Rat();
        }
    }
}
