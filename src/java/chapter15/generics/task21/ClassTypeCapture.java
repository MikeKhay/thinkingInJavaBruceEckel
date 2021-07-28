package chapter15.generics.task21;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture {

    private Map<String, Class<?>> stringClassMap = new HashMap<>();

    public void addType(String typename, Class<?> kind){
        stringClassMap.put(typename, kind);
    }

    public void printMap(){
        for (Map.Entry<String, Class<?>> m: stringClassMap.entrySet()) {
            System.out.println(m.getKey() + " = " + m.getValue());
        }
    }

    public Object createNew(String typename) throws IllegalAccessException {
        if(!stringClassMap.containsKey(typename)){
            throw new IllegalAccessException("I didn't find " + typename + " !");
        }
        try {
            return stringClassMap.get(typename).newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
