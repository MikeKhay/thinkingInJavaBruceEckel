package chapter11.task27;

public class Command {
    private String text;

    public Command(String text) {
        this.text = text;
    }

    public void operation(){
        System.out.println("It is text : " + text);
    }

    @Override
    public String toString() {
        return "Command{" +
                "text='" + text + '\'' +
                '}';
    }
}
