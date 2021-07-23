package chapter14.typeInfo.task13;

public class FactoryCount {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        for(Part part : Factories.createArray(30)){
            System.out.println(part.getClass().getSimpleName() + " ");
            counter.count(part);
        }
        System.out.println();
        System.out.println(counter);
    }
}
