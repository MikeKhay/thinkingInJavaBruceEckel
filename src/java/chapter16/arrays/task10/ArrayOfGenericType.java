package chapter16.arrays.task10;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenericType<T> {
    List<T> list;

    public ArrayOfGenericType(){
        list = new ArrayList<>();
    }
}
