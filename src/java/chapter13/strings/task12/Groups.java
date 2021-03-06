package chapter13.strings.task12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    static public final String TEXT = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA),[16] meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.[17] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub,[18][19] particularly for client-server web applications, with a reported 9 million developers";

    public static void main(String[] args) {
        int count = 0;
        Matcher m = Pattern.compile("\\s[a-z]+").matcher(TEXT);
        while(m.find()){
//            System.out.print(m.group() + " ");
            count++;
        }
        System.out.println("The number of word that begin with a lowercase letter : " + count);
    }
}
