package chapter6.task5;

public class DemonstrationModifyAccess {
    public static void main(String[] args) {
        Animal animal = new Animal("Bob","Dog",7);

        System.out.println(animal.name);
        System.out.println(animal.type);
//        System.out.println(animal.age);

        animal.getNamePublic();
        animal.getNameProtected();
//        animal.getNamePrivate();

        animal.getTypePublic();
        animal.getTypeProtected();
//        animal.getTypePrivate();

        animal.getAgePublic();
        animal.getAgeProtected();
//        animal.getAgePrivate();

    }
}
