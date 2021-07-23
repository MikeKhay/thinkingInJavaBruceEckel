package chapter14.typeInfo.task15;

public class Mutt extends Dog {
    public Mutt() {
    }

    public Mutt(String name) {
        super(name);
    }

    public static class PetCreate implements chapter14.typeInfo.task15.PetCreate<Mutt>{
        @Override
        public Mutt create() {
            return new Mutt();
        }
    }
}
