package chapter14.typeInfo.task16;

public class Mocha extends Coffee {
    public static class CreateCoffee implements chapter14.typeInfo.task16.CreateCoffee<Mocha>{
        @Override
        public Mocha create() {
            return new Mocha();
        }
    }
}
