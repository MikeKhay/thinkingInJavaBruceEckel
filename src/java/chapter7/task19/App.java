package chapter7.task19;

public class App {
    public static void main(String[] args) {
        AnimalControl animalControl = new AnimalControl(new Animal("Dog"));

        System.out.println(animalControl.toString());
    }
}
