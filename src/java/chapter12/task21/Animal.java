package chapter12.task21;

public class Animal {
    private String text;

    public Animal(String text) throws MyException {
        this.text = text;
        throw new MyException();
    }
}
