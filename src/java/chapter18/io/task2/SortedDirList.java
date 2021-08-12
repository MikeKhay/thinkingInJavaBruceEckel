package chapter18.io.task2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class SortedDirList {
    private File path;
    private String[] list;

    public SortedDirList(String s) {
        path = new File(s);
        list = path.list();
    }

    public String[] list(){
        return list;
    }

    public String[] list(String regex){
        list = path.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File file, String s) {
                return pattern.matcher(s).matches();
            }
        });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }
}
