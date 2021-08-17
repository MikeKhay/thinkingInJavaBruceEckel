package chapter18.io.task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BufferedInputFile {
    public static void writeNameFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name file (This folder) which need read : (name.format)");
        String nameFile = scanner.next();
        System.out.println("Write words to find tapes with these words");
        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        List<String> list = new ArrayList<>(Arrays.asList(temp.split(",")));
        String s = "E:\\Pomouka\\thinkingInJavaBruceEckel\\src\\java\\chapter18\\io\\task7\\" + nameFile;

        LinkedList<String> linkedListString = readFile(s);

        for (String listString : list){
            for (String linkedList : linkedListString){
                String[] split = linkedList.split("[, .]");
                List<String> arr = new LinkedList<>(Arrays.asList(split));
                for (String spl : arr){
                    if (spl.equalsIgnoreCase(listString)){
                        System.out.println(Arrays.toString(new String[]{linkedList}));
                        break;
                    }
                }
            }
        }
    }

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
