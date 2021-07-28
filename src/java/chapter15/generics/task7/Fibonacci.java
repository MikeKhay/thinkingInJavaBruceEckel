package chapter15.generics.task7;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {

    private int n;

    private int last = 0;
    private int current = 1;
    private int next = 1;
    public Integer next(){
        last = current;
        current = next;
        next = last + current;
        return last;
    }

    public Fibonacci(int count){
        n = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return Fibonacci.this.next();
            }
        };
    }

    public static void main(String[] args) {
        for(Object i : new Fibonacci(18))
            System.out.println(i + " ");
    }
}
