package chapter13.strings.task9;

public class TestReplacement {
    public static void main(String[] args) {

        String knights = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest with... a herring!";
        String s = knights.replaceAll("[aeiou]", "_");
        System.out.println(s);
    }
}
