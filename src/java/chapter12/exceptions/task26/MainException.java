package chapter12.exceptions.task26;

import java.io.FileInputStream;

public class MainException {
    public static void main(String[] args) throws Exception{
        FileInputStream file = new FileInputStream("MainE.java");
        file.close();
    }
}
