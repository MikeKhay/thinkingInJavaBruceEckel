package chapter14.typeInfo.task12;

public class CoffeeCount {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Coffee.class);
        for(Coffee coffee : Coffees.createArray(10000)) {
            System.out.println(coffee.getClass().getSimpleName() + " ");
            counter.count(coffee);
        }
        System.out.println();
        System.out.println(counter);
    }
}
