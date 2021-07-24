package chapter14.typeInfo.task25.appCallMethod;

import chapter14.typeInfo.task25.testCallSaveMethod.ClassWithMethodDifferentProtected;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppCallMethod {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ClassWithMethodDifferentProtected c = new ClassWithMethodDifferentProtected();

        callHiddenMethod(c, "publicMethod");
        callHiddenMethod(c, "protectedMethod");
        callHiddenMethod(c, "privateMethod");
    }
    static void callHiddenMethod(Object a, String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method d = a.getClass().getDeclaredMethod(methodName);
        d.setAccessible(true);
        d.invoke(a);
    }
}
