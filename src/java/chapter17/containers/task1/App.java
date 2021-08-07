package chapter17.containers.task1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("ArrayList :");
        List<Map.Entry<String, String>> arrayList = new ArrayList<>();
        fillCountriesList(arrayList, 10);

        System.out.println("LinkedList :");
        List<Map.Entry<String, String>> linkedList = new LinkedList<>();
        fillCountriesList(linkedList, 10);
    }

    public static List<Map.Entry<String, String>> fillCountriesList(List<Map.Entry<String, String>> list, int size){
        Map<String,String> countriesMap = new HashMap<String, String>(new Countries(size));
        list.addAll(countriesMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> country1, Map.Entry<String, String> country2) {
                return String.CASE_INSENSITIVE_ORDER.compare(country1.getKey(), country2.getKey());
            }
        });
        System.out.println(list);
        return list;
    }
}
