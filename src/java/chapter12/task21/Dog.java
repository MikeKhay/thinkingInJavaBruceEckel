package chapter12.task21;

public class Dog extends Animal {
    private String name;

    public Dog(String text, String name) throws MyException {
        super(text);
        this.name = name;
    }
}
