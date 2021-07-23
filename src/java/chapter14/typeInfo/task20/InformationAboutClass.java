package chapter14.typeInfo.task20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InformationAboutClass {
    public static void main(String[] args) {

        try {
            Class<?> c = Class.forName(args[0]);

            Constructor<?>[] constructors = c.getConstructors();
            if (constructors.length > 0) {
                for (Constructor<?> constructor : constructors) {
                    System.out.println(constructor);
                }
            }

            Method[] methods = c.getMethods();
            if (methods.length > 0) {
                for (Method method : methods) {
                    System.out.println(method);
                }
            }

            Field[] fields = c.getFields();
            if (fields.length > 0) {
                for (Field field : fields){
                    System.out.println(field);
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
