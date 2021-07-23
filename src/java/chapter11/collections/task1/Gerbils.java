package chapter11.collections.task1;

import java.util.ArrayList;

public class Gerbils {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilArrayList = new ArrayList<Gerbil>();
        gerbilArrayList.add(new Gerbil(1));
        gerbilArrayList.add(new Gerbil(2));
        gerbilArrayList.add(new Gerbil(3));
        gerbilArrayList.add(new Gerbil(4));
        gerbilArrayList.add(new Gerbil(7));

        for (int i = 0; i < gerbilArrayList.size(); i++) {
            gerbilArrayList.get(i).hop();
        }

    }
}
