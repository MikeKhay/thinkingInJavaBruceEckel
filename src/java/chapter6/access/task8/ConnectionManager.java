package chapter6.access.task8;

public class ConnectionManager {
    private static int MAX_CONNECTION = 3;
    private static Connection[] limitObject = new Connection[MAX_CONNECTION];
    private static int counter = 0;

    static {
        for (int i = 0; i<MAX_CONNECTION; i++){
            limitObject[i] = Connection.getConnection();
        }
    }

    public static Connection getObject(){
        return counter == MAX_CONNECTION ? null : limitObject[counter++];
    }

}
