package chapter15.generics.task17;

import java.util.EnumSet;

public class WatercolorSets {
    public static void main(String[] args) {
        EnumSet<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);

        EnumSet<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);

        System.out.println(set1);
        System.out.println();

        System.out.println(set2);
        System.out.println();

        System.out.println("union(set1, set2): " + Sets.union(set1, set2));
        System.out.println();

        EnumSet<Watercolors> subset = Sets.intersection(set1, set2);
        System.out.println("intersection(set1, set2): " + subset);
        System.out.println();

        System.out.println("difference(set1, subset): " + Sets.difference(set1, subset));
        System.out.println();

        System.out.println("difference(set2, subset): " + Sets.difference(set2, subset));
        System.out.println();

        System.out.println("complement(set1, set2): " + Sets.complement(set1, set2));

    }
}
