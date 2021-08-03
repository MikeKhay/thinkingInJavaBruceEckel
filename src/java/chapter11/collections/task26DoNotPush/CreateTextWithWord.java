package chapter11.collections.task26DoNotPush;

import java.util.*;

public class CreateTextWithWord {
    public static void main(String[] args) {

        int count = 0;

        List<String> worlds = new ArrayList<>();
        Collections.addAll(worlds,"There are multiple ways of writing and reading a text file. this is required while dealing with many applications. There are several ways to read a plain text file in Java e.g. you can use FileReader, BufferedReader or Scanner to read a text file. Every utility provides something special e.g. BufferedReader provides buffering of data for fast reading, and Scanner provides parsing ability.We can also use both BufferReader and Scanner to read a text file line by line in Java. Then Java SE 8 introduces another Stream class java.util.stream.Stream which provides a lazy and more efficient way to read a file Note : Here usual practices of writing good code like flushing/closing streams, Exception-Handling etc, have been avoided for better understanding of codes by beginners as well.".split("\\W+"));

        Map<String, ArrayList<Integer>> map = new HashMap<>();

        for(String s : worlds){
            List<Integer> freq = map.get(s);
            if(freq == null){
                List<Integer> newList = new ArrayList<>();
                newList.add(count);
                map.put(s, (ArrayList<Integer>) newList);
                count++;
            }
            else {
                freq.add(count);
                map.put(s, new ArrayList<>(freq));
                count++;
            }
        }

        List<String> createText = new ArrayList<>();

        for (Map.Entry<String, ArrayList<Integer>> m : map.entrySet()) {
            String s = m.getKey();
            for (Integer i : m.getValue()) {
                createText.add(i, s);
                System.out.print(s + ", ");
            }
        }
    }
}
