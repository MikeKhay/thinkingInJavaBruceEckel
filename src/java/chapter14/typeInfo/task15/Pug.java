package chapter14.typeInfo.task15;

public class Pug extends Dog {
    public Pug() {
    }

    public Pug(String name) {
        super(name);
    }

    public static class PetCreate implements chapter14.typeInfo.task15.PetCreate<Pug>{
        @Override
        public Pug create() {
            return new Pug();
        }
    }
}
