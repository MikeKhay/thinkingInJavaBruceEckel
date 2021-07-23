package chapter14.typeInfo.task16;

public class Breve extends Coffee {
    public static class CreateCoffee implements chapter14.typeInfo.task16.CreateCoffee<Breve>{
        @Override
        public Breve create() {
            return new Breve();
        }
    }
}
