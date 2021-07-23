package chapter14.typeInfo.task16;

public class Latte extends Coffee {
    public static class CreateCoffee implements chapter14.typeInfo.task16.CreateCoffee<Latte>{
        @Override
        public Latte create() {
            return new Latte();
        }
    }
}
