package chapter14.typeInfo.task19;

import java.lang.reflect.Constructor;

public class ToyTest {
    public static void printInfo(Class cc){
        System.out.println("Name class: " + cc.getName() + ", is it Interface? [" + cc.isInterface() +"]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
        System.out.println();
    }

    public static void main(String[] args) {
        Constructor[] cs = Toy.class.getConstructors();
        for(Constructor c : cs){
            if(c.getParameterTypes().length == 1) {
                Class<?>[] paraType = c.getParameterTypes();
                if(paraType[0] == int.class){
                    try {
                        Object o = c.newInstance(1);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                }
            }
        }
    }
}
