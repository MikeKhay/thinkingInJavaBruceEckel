package chapter14.typeInfo.task13;

import java.util.HashMap;

public class TypeCounter extends HashMap<Class<?>, Integer> {

    private Class<?> bareType;

    public TypeCounter(Class<?> bareType){
        this.bareType = bareType;
    }

    public void count(Object obj){
        Class<?> type = obj.getClass();
        if(!bareType.isAssignableFrom(type))
            throw new RuntimeException(obj + " not correct type: " + bareType);
        countClass(type);
    }

    private void countClass(Class<?> type) {
        Integer quantity = get(type);
        put(type, quantity == null ? 1 : quantity + 1);
        Class<?> superClass = type.getSuperclass();
        if(superClass != null && bareType.isAssignableFrom(superClass))
            countClass(superClass);
    }

    public String toString(){
        StringBuilder result = new StringBuilder("{");
        for (Entry<Class<?>, Integer> pair : entrySet()){
            result.append(pair.getKey().getSimpleName());
            result.append("=");
            result.append(pair.getValue());
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("}");
        return result.toString();
    }
}
