package chapter16.arrays.task24;

import java.util.Objects;

public class AutoPart {
    private int id;

    public AutoPart(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof AutoPart )) return false;
        AutoPart autoPart = (AutoPart) o;
        return id == autoPart.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AutoPart{" +
                "id=" + id +
                '}';
    }
}
