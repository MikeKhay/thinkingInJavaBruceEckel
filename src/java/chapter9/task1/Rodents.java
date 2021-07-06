package chapter9.task1;

public class Rodents {
    public static void main(String[] args) {

        Rodent[] rodents = {
                new Mouse(),
                new Hamster(),
                new Beaver()
        };

        for (Rodent r: rodents) {
            r.move();
        }

        System.out.println();

        for (Rodent r2: rodents) {
            r2.eat();
        }
    }
}
