package chapter14.typeInfo.task8;

public class SearchSuperClass {
    public static void main(String[] args) {

        Cobra cobra = new Cobra();
        searchSuperClass(cobra);
    }
    static void searchSuperClass(Object o){
        Class c = o.getClass();
        System.out.println(c);

        while (c != null) {
            Class up = c.getSuperclass();
            Object object = null;

            try {
                object = up.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
                System.out.println("Unable create object Class");
                System.exit(1);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                System.exit(1);
            }

            System.out.println(object.getClass());
            c = object.getClass();
        }
    }
}
