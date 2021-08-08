package chapter17.containers.task5;

import java.util.*;

public class CountingMapData extends AbstractMap<Integer, String> {

    private int size;
    private static String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");

    public CountingMapData(int size) {
        if(size < 0) this.size = 0;
        this.size = size;
    }

    private static class Entry implements Map.Entry<Integer, String> {

        int index;

        Entry(int index) {
            this.index = index;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!( o instanceof Entry )) return false;
            Entry entry = (Entry) o;
            return index == entry.index;
        }

        @Override
        public int hashCode() {
            return Objects.hash(index);
        }

        @Override
        public Integer getKey() {
            return index;
        }

        @Override
        public String getValue() {
            return chars[index % chars.length] + Integer.toString(index / chars.length);
        }

        @Override
        public String setValue(String s) {
            throw new UnsupportedOperationException();
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "index=" + index +
                    '}';
        }
    }

    private class EntrySet extends AbstractSet<Map.Entry<Integer, String>> {

        private int setSize = CountingMapData.this.size;
        @Override
        public int size() {
            return setSize;
        }
        @Override
        public Iterator<Map.Entry<Integer, String>> iterator() {
            return new Iterator<Map.Entry<Integer, String>>() {
                private int index;
                private Entry viewWindow = new Entry(-1);
                @Override
                public boolean hasNext() {
                    return index < setSize;
                }

                @Override
                public Map.Entry<Integer, String> next() {
                    viewWindow.index++;
                    index++;
                    return viewWindow;
                }
            };
        }
    }

    @Override
    public Set<Map.Entry<Integer, String>> entrySet() {
        return new EntrySet();
    }

    public static void main(String[] args) {
        Map<Integer, String> data = new CountingMapData(60);
        Iterator<Map.Entry<Integer, String>> ite = data.entrySet().iterator();
        System.out.print("{ ");
        while (ite.hasNext()) {
            System.out.print("[" + ite.next() + "]");
            if (ite.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.print(" } \n");
    }
}
