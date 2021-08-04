package chapter16.arrays.task24;

import java.util.Comparator;

public class CompAutoPart implements Comparator<AutoPart> {
    @Override
    public int compare(AutoPart a1, AutoPart a2) {
        return a1.getId() - a2.getId();
    }
}
