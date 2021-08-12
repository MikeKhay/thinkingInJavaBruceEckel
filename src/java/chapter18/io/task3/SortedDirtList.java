package chapter18.io.task3;

import java.io.File;

public class SortedDirtList {
    private File path;
    private String[] list;

    public SortedDirtList(String s) {
        path = new File(s);
        list = path.list();
    }

    public String[] list(){return list;}

    public File getPath(){return path;}
}
