package chapter18.io.task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
    public static void main(String[] args) {

        File path = new File("E:\\Pomouka\\thinkingInJavaBruceEckel\\src\\java\\chapter18\\io\\task1\\");
        String[] list;
        final String p;

        if(args.length == 0){
            p = ".*task1.*";
        } else {
            p = args[0];
        }

        list = path.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(p);

            @Override
            public boolean accept(File file, String name) {
                boolean result = false;
                try {
                    BufferedReader br = new BufferedReader(new FileReader(new File(file.getAbsolutePath() + "/" + name)));
                    while (true) {
                        String line = br.readLine();
                        if(line == null){
                            break;
                        }
                        if(pattern.matcher(line).matches()){
                            result = true;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Can not open file: " + file.getAbsolutePath() + name);
                }
                return result;
            }
        });

        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list){
            System.out.println(dirItem);
        }
    }
}
