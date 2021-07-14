package chapter11.task17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Gerbils {
    public static void main(String[] args) {

        Map<String, Gerbil> stringGerbilMap = new HashMap<>();
        stringGerbilMap.put("G1", new Gerbil("G11"));
        stringGerbilMap.put("G6", new Gerbil("G66"));
        stringGerbilMap.put("G4", new Gerbil("G44"));
        stringGerbilMap.put("G9", new Gerbil("G99"));
        stringGerbilMap.put("G3", new Gerbil("G33"));

        Iterator iterator = stringGerbilMap.keySet().iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            Gerbil value = stringGerbilMap.get(key);
            System.out.println("Key = " + key);
            value.hop();
        }


    }
}
