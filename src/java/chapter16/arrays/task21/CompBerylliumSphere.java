package chapter16.arrays.task21;

import java.util.Comparator;

public class CompBerylliumSphere implements Comparator<BerylliumSphere> {
    @Override
    public int compare(BerylliumSphere b1, BerylliumSphere b2) {
        return (b1.getId() < b2.getId() ? -1 : (b1.getId() == b2.getId() ? 0 : 1));
    }
}
