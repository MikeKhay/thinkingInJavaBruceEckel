package chapter18.io.task8;

import java.io.IOException;
import java.util.LinkedList;

public class ReadLinkedList {
    public static void main(String[] args) throws IOException {

        String s = BufferedInputFile.writeNameFile();
        LinkedList<String> linkedList = BufferedInputFile.readFile(s);
        BufferedInputFile.readListRevers(linkedList);
    }
}
