package chapter18.io.task12;

import java.io.*;

public class FileOutputShortcut {
    public static void copyFile(File inFile, File outFile) throws IOException {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new FileReader(inFile));

            if(!outFile.exists()){
                outFile.createNewFile();
            }

            out = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));

            int count = 0;
            String line;
            while((line = in.readLine()) != null){
                out.println("Line " + ++count + ":\t" + line);
            }
        } catch (IOException ioe) {
            System.out.println("Check your inFile and outFile!");
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e){
                System.out.println("Files cannot be closed correctly!");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 2){
            System.out.println("Check your arguments!");
        } else {
            copyFile(new File(args[0]), new File(args[1]));
        }
    }
}
