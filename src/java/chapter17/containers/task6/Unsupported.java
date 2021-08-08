package chapter17.containers.task6;

import java.util.Arrays;
import java.util.List;

public class Unsupported {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));

        System.out.println("size(): " + list.size());

        System.out.println("indexOf() : " + list.indexOf("H"));

        System.out.println("lastIndexOf() : " + list.lastIndexOf("H"));

        System.out.println("get(): " + list.get(3));

        try {
            list.add("W");
        } catch (Exception e){
            System.out.println("add() : " + e);
        }

        try {
            list.addAll(Arrays.asList("D B F R".split("")));
        } catch (Exception e){
            System.out.println("addAll() : " + e);
        }

        try {
            list.clear();
        } catch (Exception e){
            System.out.println("clear() : " + e);
        }

        try {
            list.remove(5);
        } catch (Exception e){
            System.out.println("remove() : " + e);
        }
    }
}
