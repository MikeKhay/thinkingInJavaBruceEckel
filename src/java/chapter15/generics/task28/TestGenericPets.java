package chapter15.generics.task28;


import chapter15.generics.task1.ForNameCreator;
import chapter15.generics.task1.Pet;
import chapter15.generics.task1.PetCreator;

public class TestGenericPets<T> {

    public void method1(Generic1<T> g, T t) {
        g.setArgumentTypeT(t);
    }

    public T method2(Generic2<? extends T> g){
        return g.getArgumentTypeT();
    }

    public static void main(String[] args) {
        PetCreator creator = new ForNameCreator();
        TestGenericPets testGenericPets = new TestGenericPets();
        testGenericPets.method1(new Generic1<Object>(creator.randomPet()), creator.randomPet());
        testGenericPets.method2(new Generic2<Pet>(creator.randomPet()));
    }
}
