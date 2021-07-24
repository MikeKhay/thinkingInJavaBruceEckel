package chapter14.typeInfo.task23;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public static long count = 0;

    public DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);

        if(args != null)
            for (Object arg : args)
                System.out.println(" " + arg);
        count++;

        return method.invoke(proxied, args);
    }

    public static void showCount(){
        System.out.println("Proxy is invoked " + count + " times.");
    }
}
