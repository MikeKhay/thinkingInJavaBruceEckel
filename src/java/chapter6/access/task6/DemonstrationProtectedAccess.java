package chapter6.access.task6;

public class DemonstrationProtectedAccess {
    public static void main(String[] args) {
        ProtectedInformation pi = new ProtectedInformation("Fish", 4);
        getInformation(pi);

    }
    public static void getInformation(ProtectedInformation object){
        System.out.println("Type : " + object.type);
        System.out.println("Age : " + object.age);
    }
}
