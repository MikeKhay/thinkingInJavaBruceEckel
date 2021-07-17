package chapter11.task32;

public class Pet {
    protected int id;
    protected String type;

    public Pet(int id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
