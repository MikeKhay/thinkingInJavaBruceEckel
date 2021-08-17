package chapter18.io.task7;

import java.io.IOException;

import static chapter18.io.task7.BufferedInputFile.readFile;

public class ReadLinkedList {
    public static void main(String[] args) throws IOException {
        String s = "E:\\Pomouka\\thinkingInJavaBruceEckel\\src\\java\\chapter18\\io\\task7\\text.txt";

        BufferedInputFile.readListRevers(readFile(s));
    }
}
