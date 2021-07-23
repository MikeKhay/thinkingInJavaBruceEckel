package chapter10.innerClasses.task4;

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x){
        if(next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector{

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length) i++;
        }

        public Sequence newSequence(){
            return Sequence.this;
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        Sequence.SequenceSelector sequenceSelector = sequence.new SequenceSelector();

        Sequence sequence1 = sequenceSelector.newSequence();

        for(int i = 0; i < 10; i++)
            sequence1.add(Integer.toString(i));
        Selector selector = sequence1.selector();
        while(!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
