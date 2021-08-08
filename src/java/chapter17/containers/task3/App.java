package chapter17.containers.task3;

import java.util.*;

public class App {

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

    public static void main(String[] args) {

        List<Map.Entry<String, String>> countriesList = getSortedCountries();
        Set<Map.Entry<String, String>> countriesSet = fillSetByList(countriesList);
        System.out.println("First time: ");
        System.out.println(countriesSet);
        System.out.println("Second time: ");
        countriesSet.addAll(countriesList);
        System.out.println(countriesSet);
    }
}
