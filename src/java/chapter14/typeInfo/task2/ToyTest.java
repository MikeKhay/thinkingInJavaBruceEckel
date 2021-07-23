package chapter14.typeInfo.task2;

public class ToyTest {
    public static void printInfo(Class cc){
        System.out.println("Name class: " + cc.getName() + ", is it Interface? [" + cc.isInterface() +"]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
        System.out.println();
    }

    public static void main(String[] args) {

        Class c = null;

        try{
            c = Class.forName("chapter14.typeInfo.task2.FancyToy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Unable to find FancyToy");
            System.exit(1);
        }

        printInfo(c);

        for (Class face : c.getInterfaces())
            printInfo(face);

        Class up = c.getSuperclass();

        Object obj = null;

        try{
            obj = up.newInstance();
        } catch (InstantiationException e){
            e.printStackTrace();
            System.out.println("Unable to create copy object");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("Denied access");
            System.exit(1);
        }

        printInfo(obj.getClass());
    }
}
