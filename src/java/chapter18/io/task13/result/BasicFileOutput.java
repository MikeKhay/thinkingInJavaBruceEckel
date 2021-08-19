//1: package chapter18.io.task13;
//2:
//3: import java.io.*;
//4:
//5: public class BasicFileOutput {
//6:     static String file = "E:\\Pomouka\\thinkingInJavaBruceEckel\\src\\java\\chapter18\\io\\task13\\result\\BasicFileOutput.java";
//7:
//8:     public static void main(String[] args) throws IOException {
//9:         String st = "E:\\Pomouka\\thinkingInJavaBruceEckel\\src\\java\\chapter18\\io\\task13\\BasicFileOutput.java";
//10:         LineNumberReader in = new LineNumberReader(new FileReader(new File(st)));
//11:         PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
//12:         int lineCount = 1;
//13:         String s;
//14:         while((s = in.readLine()) != null){
//15:             out.println(in.getLineNumber() + ": " + s);
//16:         }
//17:         out.close();
//18: //        System.out.println(BufferedInputFile.read(file));
//19:     }
//20: }
