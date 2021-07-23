package chapter14.typeInfo.task16;

public class Cappuccino extends Coffee {
    public static class CreateCoffee implements chapter14.typeInfo.task16.CreateCoffee<Cappuccino>{
        @Override
        public Cappuccino create() {
            return new Cappuccino();
        }
    }
}
