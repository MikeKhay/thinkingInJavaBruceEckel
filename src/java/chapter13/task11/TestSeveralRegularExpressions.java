package chapter13.task11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSeveralRegularExpressions {
    public static void main(String[] args) {
        String text = "Arline ate eight apples and one orange while Anita hadn't any";

        Pattern p = Pattern.compile("(?i)(([aeiou])|(\\s+[aeiou]))\\W+?[aeiou]\b");
        Matcher m = p.matcher(text);
        System.out.println(m.toString());

    }
}
