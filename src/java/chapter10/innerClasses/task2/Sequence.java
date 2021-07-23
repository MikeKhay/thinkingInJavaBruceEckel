package chapter10.innerClasses.task2;

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

    private class SequenceSelector implements Selector {

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
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public class Animal{
        String type;

        public Animal(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "type='" + type + '\'' +
                    '}';
        }
    }

    public Animal newAnimal(String text){
        return new Animal(text);
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(3);
//        for(int i = 0; i < 10; i++)
//            sequence.add(Integer.toString(i));
//
        Animal dog = sequence.newAnimal("Dog");
        Animal cat = sequence.newAnimal("Cat");
        Animal fish = sequence.newAnimal("Fish");
        sequence.add(dog);
        sequence.add(cat);
        sequence.add(fish);

        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
