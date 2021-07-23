package chapter11.collections.task16;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) throws FileNotFoundException {

        int countOneVowelsWord = 0;
        int countAllVowels = 0;

        Set<String> vowels = new TreeSet<>();
        Collections.addAll(vowels,"a e i o u y".split(" "));

        Set<String> worlds = new TreeSet<>();
        Collections.addAll(worlds,"There are multiple ways of writing and reading a text file. this is required while dealing with many applications. There are several ways to read a plain text file in Java e.g. you can use FileReader, BufferedReader or Scanner to read a text file. Every utility provides something special e.g. BufferedReader provides buffering of data for fast reading, and Scanner provides parsing ability.We can also use both BufferReader and Scanner to read a text file line by line in Java. Then Java SE 8 introduces another Stream class java.util.stream.Stream which provides a lazy and more efficient way to read a file Note : Here usual practices of writing good code like flushing/closing streams, Exception-Handling etc, have been avoided for better understanding of codes by beginners as well.".split("\\W+"));

        for (String s : worlds){
            String[] oneWord = s.split("");
            for (String oneLaterWord : oneWord){
                for (String oneLaterVowels : vowels){
                    if(oneLaterWord.equals(oneLaterVowels)){
                        countOneVowelsWord++;
                        countAllVowels++;
                    }
                }
            }
            System.out.println("Word << " + s + " >> have vowels = " + countOneVowelsWord);
            countOneVowelsWord = 0;
        }
        System.out.println();
        System.out.println("All vowels in text = " + countAllVowels);

    }
}
