package chapter7.reusing.task4;

public class Cartoon extends Drawing {
    public Cartoon(){
        System.out.println("Constructor Carton");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
