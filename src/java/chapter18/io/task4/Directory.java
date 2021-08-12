package chapter18.io.task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Directory {
    private List<File> files = new ArrayList<>();
    private List<File> dirs = new ArrayList<>();
    private int size = 0;
    private int lines = 0;

    public Directory(){
        this(".");
    }

    public Directory(String dir){
        this(new File(dir));
    }

    public Directory(File dir){
        this(dir, ".");
    }

    public Directory(String dir, String regex){
        this(new File(dir), regex);
    }

    public Directory(File dir, String regex){
        recurseDirs(dir, new FilenameFilter(){
            private Pattern p = Pattern.compile(regex);
            public boolean accept(File dir, String name){
                return p.matcher(name).matches();
            }
        });
        statistic();
    }

    public Directory(File dir, FilenameFilter filter){
        recurseDirs(dir, filter);
        statistic();
    }

    public void recurseDirs(File dir, FilenameFilter filter){
        File[] children = dir.listFiles();
        if (children == null || children.length == 0){
            return;
        }
        for (File f : children){
            if (f.isDirectory()){
                dirs.add(f);
                recurseDirs(f, filter);
            } else {
                if (filter.accept(dir, f.getName())){
                    files.add(f);
                }
            }
        }
    }

    public void statistic(){
        if (files!=null && files.size() > 0){
            size = files.size();
            int num = 0;
            for (File file : files){
                try {
                    BufferedReader bf = new BufferedReader(new FileReader(file));
                    while(bf.readLine() != null) {
                        num++;
                    }
                } catch (Exception e){
                    System.out.println(file.getName() + " can not open!");
                }
            }
            lines = num;
        }
    }

    public List<File> getFile(){
        return files;
    }

    public List<File> getDir(){
        return dirs;
    }

    public void showStatistic(){
        System.out.println("File number :     " + size + "\n" + "Total Lines:    " + lines + "\n");
    }
}
