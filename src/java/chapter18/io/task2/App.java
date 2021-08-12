package chapter18.io.task2;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        SortedDirList dl = new SortedDirList("E:\\Pomouka\\thinkingInJavaBruceEckel\\src\\java\\chapter18\\io\\task2\\");
        String[] fullList = dl.list();
        String[] filteredList = dl.list(".*Ran.*");

        System.out.println("Full list : " + Arrays.toString(fullList) + "\n");
        System.out.println("Gen list : " + Arrays.toString(filteredList));
    }
}
