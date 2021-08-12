package chapter18.io.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class App {
    public static int countLine(File dir, String[] list){
        if (list.length == 0){
            return 0;
        }
        int result = 0;
        for(String name: list){
            try {
                BufferedReader br = new BufferedReader(new FileReader(new File(dir + "/" + name)));
                while (br.readLine()!= null){
                    result++;
                }
            } catch (Exception e){
                System.out.println("Can not open the file: " + dir + "/" + name);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SortedDirtList dl = new SortedDirtList("E:\\Pomouka\\thinkingInJavaBruceEckel\\src\\java\\chapter18\\io\\task3\\");

        String[] fullList = dl.list();

        System.out.println("Total line: " + countLine(dl.getPath(), fullList));
    }
}
