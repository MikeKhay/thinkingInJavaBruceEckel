package chapter15.generics.task1;

public class Holder<T> {

    private T a;

    public Holder(T a) {
        this.a = a;
    }

    public void set(T a){
        this.a = a;
    }

    public T get(){
        return a;
    }

    public static void main(String[] args) {
        Holder<Pet> petHolder = new Holder<>(new Pet());
        petHolder.set(new Cat());
        petHolder.set(new Cymric());

        Pet pet = petHolder.get();

        System.out.println(pet.getClass().getSimpleName());

    }

}
