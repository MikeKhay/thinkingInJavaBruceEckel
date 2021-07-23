package chapter11.collections.task7;

public class Animal {
    private int id;
    private String type;

    public Animal(int id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
