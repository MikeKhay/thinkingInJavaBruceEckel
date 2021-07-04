package chapter7.task2;

public class Liquid extends Detergent{
    @Override
    public void scrub() {
        System.out.println("Method Liquid.scrub");
//        super.scrub();
    }

    public void sterilize(){
        System.out.println("Method Liquid.sterilize");
    }

    public static void main(String[] args) {
        Liquid liquid = new Liquid();
        liquid.scrub();
        liquid.sterilize();
    }
}
