package chapter14.typeInfo.task24;

public class FactoryCount {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        for(Part part : Factories.createArray(50)){
            System.out.println(part.getClass().getSimpleName() + " ");
            counter.count(part);
        }
        System.out.println();
        System.out.println(counter);
    }
}
