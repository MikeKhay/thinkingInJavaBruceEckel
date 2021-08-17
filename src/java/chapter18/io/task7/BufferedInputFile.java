package chapter18.io.task7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class BufferedInputFile {
    public static LinkedList<String> readFile(String fileName) throws IOException {
        LinkedList<String> linkedList = new LinkedList<>();
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String s;
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine()) != null){
            linkedList.add(s);
        }
        in.close();
        return linkedList;
    }

    public static void readListRevers(LinkedList<String> list){
        int listSize = list.size();
        for (String l : list){
            System.out.println("Line num : " + listSize + " , text line : " + list.get(listSize - 1));
            listSize--;
        }
    }
}
