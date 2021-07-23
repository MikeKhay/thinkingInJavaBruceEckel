package chapter14.typeInfo.task10;

public class CharIsObjectOrPrimitiveType {
    private static java.lang.Object Object;

    public static void main(String[] args) {

        String s = "bla bla";
        System.out.println("Is array char an object : " + isObjectTypeOrPrimitiveType(s));

    }
    static boolean isObjectTypeOrPrimitiveType(Object obj){
        Class<?> c = obj.getClass();
        return c.equals(char[].class);
    }
}
