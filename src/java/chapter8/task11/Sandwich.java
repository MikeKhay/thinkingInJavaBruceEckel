package chapter8.task11;

public class Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich(){
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
//        Sandwich sandwich = new Sandwich();
        new Sandwich();
    }
}
