package chapter3.operator.task6;

public class App {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Spot";
        dog1.says = "Arrr";

        Dog dog2 = new Dog();
        dog2.name = "Scruffy";
        dog2.says = "Gaw";

        Dog dog3 = new Dog();
        dog1 = dog3;

        System.out.println("Dog1 == Dog3 : " + (dog1 == dog3));
        System.out.println("Dog1 equals Dog3 : " + (dog1.equals(dog3)));


    }
}
