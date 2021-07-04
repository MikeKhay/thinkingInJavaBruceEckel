package chapter6.task8;

public class App {
    public static void main(String[] args) {

        Connection c1 = ConnectionManager.getObject();
        Connection c2 = ConnectionManager.getObject();
        Connection c3 = ConnectionManager.getObject();
        Connection c4 = ConnectionManager.getObject();
        Connection c5 = ConnectionManager.getObject();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

    }
}
