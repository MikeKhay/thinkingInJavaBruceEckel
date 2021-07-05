package chapter8.task12;

public class Mouse extends Rodent {

    private Characteristic c = new Characteristic("Mouse!!!");

    public Mouse() {
        System.out.println("Mouse()");
    }

    public void move(){
        System.out.println("Run!!!");
    }
    public void eat(){
        System.out.println("Eat Rubbish");
    }
}
