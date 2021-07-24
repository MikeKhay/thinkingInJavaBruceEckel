package chapter14.typeInfo.task26;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Music {
    public static void main(String[] args) {

        Wind wind = new Wind();
        Woodwind woodwind = new Woodwind();

        try {
            Class<?> c = wind.getClass();
            Method m = c.getDeclaredMethod("clearSpitValve");
            m.setAccessible(true);
            m.invoke(woodwind);

        } catch (NoSuchMethodException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
