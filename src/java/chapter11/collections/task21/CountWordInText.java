package chapter11.collections.task21;

import java.util.*;

public class CountWordInText {
    public static void main(String[] args) {

        List<String> worlds = new ArrayList<>();
        Collections.addAll(worlds,"There are multiple ways of writing and reading a text file. this is required while dealing with many applications. There are several ways to read a plain text file in Java e.g. you can use FileReader, BufferedReader or Scanner to read a text file. Every utility provides something special e.g. BufferedReader provides buffering of data for fast reading, and Scanner provides parsing ability.We can also use both BufferReader and Scanner to read a text file line by line in Java. Then Java SE 8 introduces another Stream class java.util.stream.Stream which provides a lazy and more efficient way to read a file Note : Here usual practices of writing good code like flushing/closing streams, Exception-Handling etc, have been avoided for better understanding of codes by beginners as well.".split("\\W+"));

        Map<String, Integer> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for(String s : worlds){
            Integer freq = map.get(s);
            map.put(s, freq == null ? 1 : freq + 1);
        }



        for(Map.Entry<String, Integer> m : map.entrySet()){
            System.out.println("Word = " + m.getKey() + ", Count = " + m.getValue());
        }

    }
}
