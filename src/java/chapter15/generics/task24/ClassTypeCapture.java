package chapter15.generics.task24;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture {

    private Map<String, Factory<?>> stringClassMap = new HashMap<>();

    public void addType(String typename, Factory<?> factory){
        stringClassMap.put(typename, factory);
    }

    public void printMap(){
        for (Map.Entry<String, Factory<?>> m: stringClassMap.entrySet()) {
            System.out.println(m.getKey() + " = " + m.getValue());
        }
    }

    public Object createNew(String typename) throws IllegalAccessException {
        if(!stringClassMap.containsKey(typename)){
            throw new IllegalAccessException("I didn't find " + typename + " !");
        }
        return stringClassMap.get(typename).create();
    }
}
