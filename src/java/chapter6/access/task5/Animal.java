package chapter6.access.task5;

public class Animal {
    public String name;
    protected String type;
    private int age;

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public void getNamePublic(){
        System.out.println("Name animal : " + name);
    }

    public void getTypePublic(){
        System.out.println("Type animal : " + type);
    }

    public void getAgePublic(){
        System.out.println("Age animal : " + age);
    }

    protected void getNameProtected(){
        System.out.println("Name animal : " + name);
    }

    protected void getTypeProtected(){
        System.out.println("Type animal : " + type);
    }

    protected void getAgeProtected(){
        System.out.println("Age animal : " + age);
    }

    private void getNamePrivate(){
        System.out.println("Name animal : " + name);
    }

    private void getTypePrivate(){
        System.out.println("Type animal : " + type);
    }

    private void getAgePrivate(){
        System.out.println("Age animal : " + age);
    }
}
