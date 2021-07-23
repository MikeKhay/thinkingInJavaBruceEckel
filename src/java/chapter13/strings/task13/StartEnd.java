package chapter13.strings.task13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
    public static String input = "Java is a high-level, class-based, object-oriented programming language that is\n" +
            "designed to have as few implementation dependencies as possible. It is a general-purpose programming\n" +
            "language intended to let application developers write once, run anywhere (WORA),[16] meaning that\n" +
            "compiled Java code can run on all platforms that support Java without the need for recompilation.[17]\n" +
            "Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM)\n" +
            "regardless of the underlying computer architecture. The syntax of Java is similar to C and C++,\n" +
            "but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities\n" +
            "(such as reflection and runtime code modification) that are typically not available in traditional compiled languages.\n" +
            "As of 2019, Java was one of the most popular programming languages in use according to GitHub,[18][19]\n" +
            "particularly for client-server web applications, with a reported 9 million developers";

    public static class Display {
        private boolean regexPrinted = false;
        private String regex;

        public Display(String regex) {
            this.regex = regex;
        }

        void display(String message){
            if(!regexPrinted){
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }
    }
    static void examine(String s, String regex){

        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find())
            d.display("find() '" + m.group() + "' start = " + m.start() + " end = " + m.end());

        if(m.lookingAt())
            d.display("lookingAt() start = " + m.start() + " end = " + m.end());

        if(m.matches())
            d.display("matches() start = " + m.start() + " end = " + m.end());
    }

    public static void main(String[] args) {

        for(String in : input.split("\n")){
            System.out.println("input : " + in);
            for (String regex : new String[]{"\\w*ere\\w*", "\\w*ever", "T\\w+", "Never.*?!"})examine(in,regex);
        }
    }
}
