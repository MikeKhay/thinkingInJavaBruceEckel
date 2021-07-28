package chapter15.generics.task11;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestClass {
    public static void main(String[] args) {
        Map<String, List<String>> map = New.map();
        List<Integer> list = New.list();
        Set<Double> set = New.set();
    }
}
