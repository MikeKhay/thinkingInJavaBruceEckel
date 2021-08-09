package chapter17.containers.task13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class TestDifferentMap {
    public static void main(String[] args) {

        String s = "E:\\Pomouka\\thinkingInJavaBruceEckel\\src\\java\\chapter17\\containers\\task12\\text.txt";
        String[] strings = readFile(s);
//        System.out.println(Arrays.toString(strings));
        countWord(strings);
    }

    public static void countWord(String[] array){
        Map m1 = new HashMap();
//        AssociativeArray<String, Integer> m1 = new AssociativeArray<>(array.length);
        for (int i = 0; i < array.length; i++){
            if (m1.get(array[i]) == null){
                m1.put(array[i], 1);
            } else {
                int newValue = (int) m1.get(array[i]);
                newValue++;
                m1.put(array[i], newValue);
            }
        }
        System.out.println(m1);
    }

    public static String[] readFile(String s){
        try {
            BufferedReader br = new BufferedReader(new FileReader(s));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null){
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                String everything = sb.toString();
                return everything.split("[^\\w+]");
            } finally {
                br.close();
            }
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        return null;
    }
}
