package chapter13.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpressions {
    public static void main(String[] args) {
        String s = "London of the capital of Great Britain.";

        Pattern pattern1 = Pattern.compile("^[A-Z]");
        Matcher matcher1 = pattern1.matcher(s);
        System.out.println("The text begins with a capital latter : " + matcher1.find());

        Pattern pattern2 = Pattern.compile("[.]$");
        Matcher matcher2 = pattern2.matcher(s);
        System.out.println("The text ends with a period : " + matcher2.find());
    }
}
