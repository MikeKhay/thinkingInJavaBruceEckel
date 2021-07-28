package chapter15.generics.task23;

public abstract class GenericWithCreate<T> {
    final T element;
    GenericWithCreate(){
        element = create();
    }

    protected abstract T create();

    abstract T create(int size);
}
