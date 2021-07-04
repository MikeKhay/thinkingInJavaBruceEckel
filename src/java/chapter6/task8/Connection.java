package chapter6.task8;

public class Connection {
    private Connection() {
    }

    public static Connection getConnection(){
        return new Connection();
    }
}
