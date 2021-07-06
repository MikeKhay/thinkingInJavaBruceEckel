package chapter9.task8;

public class Sandwich extends Meal implements FastFood{
    private Bread b;
    private Cheese c;
    private Lettuce l;

    public Sandwich(){
        System.out.println("Sandwich()");
    }

    @Override
    public void createSandwich() {

        b = new Bread();
        c = new Cheese();
        l = new Lettuce();
        new Sandwich();
    }

    @Override
    public void sellSandwich() {
        System.out.println("Sandwich sell");;
    }
}
