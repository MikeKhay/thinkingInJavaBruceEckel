package chapter14.typeInfo.task16;

public class Americano extends Coffee {
    public static class CreateCoffee implements chapter14.typeInfo.task16.CreateCoffee<Americano>{
        @Override
        public Americano create() {
            return new Americano();
        }
    }
}
