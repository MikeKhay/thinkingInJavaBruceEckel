package chapter18.io.task13;

import java.io.*;

public class BasicFileOutput {
    static String file = "E:\\Pomouka\\thinkingInJavaBruceEckel\\src\\java\\chapter18\\io\\task13\\result\\BasicFileOutput.java";

    public static void main(String[] args) throws IOException {
        String st = "E:\\Pomouka\\thinkingInJavaBruceEckel\\src\\java\\chapter18\\io\\task13\\BasicFileOutput.java";
        LineNumberReader in = new LineNumberReader(new FileReader(new File(st)));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while((s = in.readLine()) != null){
            out.println(in.getLineNumber() + ": " + s);
        }
        out.close();
//        System.out.println(BufferedInputFile.read(file));
    }
}
