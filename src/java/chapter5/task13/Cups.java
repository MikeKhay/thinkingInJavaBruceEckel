package chapter5.task13;

class Cups {

    static Cup cup1;
    static Cup cup2;


    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups(){
        System.out.println("Cups()");
    }
}
