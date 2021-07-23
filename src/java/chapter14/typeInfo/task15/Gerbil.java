package chapter14.typeInfo.task15;

public class Gerbil extends Hamster {
    public Gerbil() {
    }

    public Gerbil(String name) {
        super(name);
    }

    public static class PetCreate implements chapter14.typeInfo.task15.PetCreate<Gerbil>{
        @Override
        public Gerbil create() {
            return new Gerbil();
        }
    }
}
