package chapter11.collections.task22;

import java.util.*;

public class CountWordObjectInText {
    public static void main(String[] args) {

        List<String> worlds = new ArrayList<>();
        Collections.addAll(worlds,"There are multiple ways of writing and reading a text file. this is required while dealing with many applications. There are several ways to read a plain text file in Java e.g. you can use FileReader, BufferedReader or Scanner to read a text file. Every utility provides something special e.g. BufferedReader provides buffering of data for fast reading, and Scanner provides parsing ability.We can also use both BufferReader and Scanner to read a text file line by line in Java. Then Java SE 8 introduces another Stream class java.util.stream.Stream which provides a lazy and more efficient way to read a file Note : Here usual practices of writing good code like flushing/closing streams, Exception-Handling etc, have been avoided for better understanding of codes by beginners as well.".split("\\W+"));

        Set<Word> wordSet = new HashSet<>();

        for (String s : worlds){
            wordSet.add(new Word(s));
        }

        for (Word w : wordSet){
            System.out.println("Word = " + w.word + ", count = " + w.count);
        }
    }
}
