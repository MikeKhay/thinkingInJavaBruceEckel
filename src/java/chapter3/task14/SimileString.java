package chapter3.task14;

public class SimileString {
    public static void main(String[] args) {

//        String s1 = new String("Mike");
//        String s2 = new String("Mike");
//        String s3 = new String("Ryslan");

        String s1 = "Mike";
        String s2 = "Mike";
        String s3 = "Ryslan";

        simileString(s1, s2);
        simileString(s1, s3);

    }

    static void simileString(String s1, String s2){
        System.out.println("s1( " + s1 + " ) == s2( " + s2 + " ) : " + (s1 == s2));
        System.out.println("s1( " + s1 + " ) != s2( " + s2 + " ) : " + (s1 != s2));
        System.out.println("s1( " + s1 + " ).equals(s2( " + s2 + " )) : " + (s1.equals(s2)));
    }
}
