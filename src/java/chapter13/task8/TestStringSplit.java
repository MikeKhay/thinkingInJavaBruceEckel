package chapter13.task8;

import java.util.Arrays;

public class TestStringSplit {
    public static void main(String[] args) {

        String knights = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest with... a herring!";
        String[] split = knights.split("the|you");
        System.out.println(Arrays.toString(split));
    }
}
