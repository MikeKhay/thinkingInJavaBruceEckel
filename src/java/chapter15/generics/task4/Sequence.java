package chapter15.generics.task4;

public class Sequence<T> {
    private T[] items;
    private int next = 0;

    public Sequence(int size){
        T[] tArray = (T[]) new Object[size];
        items = tArray;
    }

    public void add(T t){
        if(next < items.length)
            items[next++] = t;
    }

    private class SequenceSelector implements Selector<T> {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public T current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length)
                i++;
        }
    }

    public Selector<T> selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence<String> sequence = new Sequence<>(10);
        for(int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector<String> selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
