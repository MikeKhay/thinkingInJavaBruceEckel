package chapter13.strings.task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSeveralRegularExpressions {
    public static void main(String[] args) {
        String text = "Java now ha regular expressions";

        String sff = "^Java Breg.* n.w\\s+h(a|i)s s? s* s+ s{4} s{1} s{0,3}";

        String[] splitArray = sff.split(" ");
//        System.out.println(Arrays.toString(splitArray));

        for (String s : splitArray){
            Pattern p = Pattern.compile(s);
            Matcher m = p.matcher(text);
            while(m.find()){
                System.out.println("Match \"" + s + "\" at position " + m.start() + "-" + (m.end() -1));
            }
        }
    }
}
