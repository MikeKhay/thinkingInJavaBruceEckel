package chapter17.containers.task14;

import java.util.Map;
import java.util.Properties;

public class Maps {
    public static void printPropertyKeys(Map<Object, Object> map) {
        System.out.print("Size = " + map.size() + ", ");
        System.out.print("Keys: ");
        System.out.println(map.keySet());
    }

    public static void testProperties(Map<Object, Object> map) {

        System.out.println(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
        map.putAll(new CountingMapData(25));
        printPropertyKeys(map);

        System.out.println("Values : ");
        System.out.println(map.values());
        System.out.println(map);

        System.out.println("map.containsKey(11): " + map.containsKey(11));
        System.out.println("map.get(11): " + map.get(11));
        System.out.println("map.containsValue(\'F0\'): " + map.containsKey("F0"));

        @SuppressWarnings("uncheked")
                Integer key = (Integer) map.keySet().iterator().next();
        System.out.println("First key in map: " + key);

        map.remove(key);
        printPropertyKeys(map);
        map.clear();
        System.out.println("map.isEmpty(): " + map.isEmpty());
        map.putAll(new CountingMapData(25));
        map.keySet().removeAll(map.keySet());
        System.out.println("map.isEmpty(): " + map.isEmpty());
    }

    public static void main(String[] args) {
        Maps.testProperties(new Properties());
    }
}
