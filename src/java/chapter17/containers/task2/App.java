package chapter17.containers.task2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    private static void simpleMethod(String regex) {
        Map<String, String> resultMap = new HashMap<>();
        Matcher m = Pattern.compile(regex).matcher("");
        Countries c = new Countries();
        Set<Map.Entry<String, String>> entries = c.entrySet();
        for (Map.Entry<String, String> country : entries){
            m.reset(country.getKey());
            if (m.find()){
                resultMap.put(country.getKey(), country.getValue());
            }
        }
        System.out.println(resultMap);
        System.out.println(resultMap.entrySet());
    }

    public static class CountryPair implements Map.Entry<String, String> {

        private final String name;
        private final String capital;

        public CountryPair(String name, String capital) {
            this.name = name;
            this.capital = capital;
        }

        @Override
        public String getKey() {
            return name;
        }

        @Override
        public String getValue() {
            return capital;
        }

        @Override
        public String setValue(String s) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!( o instanceof CountryPair )) return false;
            CountryPair that = (CountryPair) o;
            return Objects.equals(name, that.name) &&
                    Objects.equals(capital, that.capital);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, capital);
        }

        @Override
        public String toString() {
            return "CountryPair{" +
                    "name='" + name + '\'' +
                    ", capital='" + capital + '\'' +
                    '}';
        }
    }

    public static <T> Set<T> fillSetByList(List<T> list){
        Set<T> set = new HashSet<>();
        set.addAll(list);
        return set;
    }

    public static <K, V> Map<K, V> fillMapByList(List<Map.Entry<K, V>> list){
        if (list == null || list.isEmpty()){
            return null;
        }
        Map<K, V> map = new HashMap<K, V>();
        for (Map.Entry<K, V> ele : list){
            map.put(ele.getKey(), ele.getValue());
        }
        return map;
    }

    public static List<Map.Entry<String, String>> getSortedCountries(int size){
        List<Map.Entry<String, String>> countriesList = new ArrayList<>();
        for (Map.Entry<String, String> country : new Countries(size).entrySet()){
            countriesList.add(new CountryPair(country.getKey(), country.getValue()));
        }
        Collections.sort(countriesList, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> country1, Map.Entry<String, String> country2) {
                return String.CASE_INSENSITIVE_ORDER.compare(country1.getKey(), country2.getKey());
            }
        });
        return countriesList;
    }

    public static List<Map.Entry<String, String>> getSortedCountries(){
        int countriesSize = Countries.dataSize();
        return getSortedCountries(countriesSize);
    }

    private static List<Map.Entry<String, String>> getCountriesByRegex(String regex) {
        List<Map.Entry<String, String>> resultList = new ArrayList<>();
        Matcher m = Pattern.compile(regex).matcher("");
        for (Map.Entry<String, String> country : getSortedCountries()){
            m = m.reset(country.getKey());
            if (m.find()){
                resultList.add(country);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        String regex = "^A";
//        simpleMethod(regex);
        System.out.println(fillSetByList(getCountriesByRegex(regex)));
        System.out.println();
        System.out.println(fillMapByList(getCountriesByRegex(regex)));
    }
}
