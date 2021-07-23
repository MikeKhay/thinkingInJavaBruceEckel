package chapter3.operator.task5;

public class App {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Spot";
        dog1.says = "Arrr";

        Dog dog2 = new Dog();
        dog2.name = "Scruffy";
        dog2.says = "Gaw";

        System.out.println("Dog1 : name = " + dog1.name + " , says = " + dog1.says);
        System.out.println("Dog2 : name = " + dog2.name + " , says = " + dog2.says);


    }
}
