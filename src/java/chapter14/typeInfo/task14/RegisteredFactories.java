package chapter14.typeInfo.task14;

public class RegisteredFactories {
    public static void main(String[] args) {
        for(int i = 0; i < 20; i ++)
            System.out.println(Part.createRandom());
    }
}
