package chapter14.typeInfo.task7;

public class SweetShop {
    public static void main(String[] args) {

        createObject("Gum");
    }
    static void createObject(String cc){
        String s = "chapter14.typeInfo.task7." + cc;

        try {
            Class c = Class.forName(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
