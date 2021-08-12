package chapter17.containers.task15;

import java.util.*;

public class SlowMap<K, V> extends AbstractMap<K,V> {

    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    public V put(K key, V value) {
        V oldValue = get(key);
        if(!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(keys.indexOf(key), value);
        }
        return oldValue;
    }

    public V get(Object key){
        if(!keys.contains(key)){
            return null;
        }
        return values.get(keys.indexOf(key));
    }

    public class MapEntry<K,V> implements Map.Entry<K,V> {

        private K key;
        private V value;

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V v) {
            V result = value;
            value = v;
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!( o instanceof MapEntry )) return false;
            MapEntry<?, ?> mapEntry = (MapEntry<?, ?>) o;
            return Objects.equals(key, mapEntry.key) &&
                    Objects.equals(value, mapEntry.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }

        @Override
        public String toString() {
            return "MapEntry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    @Override
    public Set<Map.Entry<K,V>> entrySet() {
        Set<Map.Entry<K,V>> set = new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while(ki.hasNext()){
            set.add(new MapEntry<K,V>(ki.next(), vi.next()));
        }
        return set;
    }
}
