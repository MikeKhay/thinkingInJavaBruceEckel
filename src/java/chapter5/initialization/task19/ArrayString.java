package chapter5.initialization.task19;

public class ArrayString {
    static void setArrayString(Object ... args){
        for (Object o : args) {
            System.out.println(o.toString());
        }
    }
}
