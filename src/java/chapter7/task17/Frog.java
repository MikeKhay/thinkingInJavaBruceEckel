package chapter7.task17;

public class Frog extends Amphibian {
    @Override
    public void jump() {
        System.out.println("Jump");
    }

    @Override
    public void swimming() {
        System.out.println("Swimming");
    }

    @Override
    public void sit() {
        System.out.println("Sit");
    }
}
