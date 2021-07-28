package chapter15.generics.task8;

import java.util.Iterator;
import java.util.Random;

public class StoryCharactersGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters>
{

    private Class[] types = {BadMonster.class, BadMouse.class, BadSnake.class, GoodCat.class, GoodDog.class, GoodPerson.class};

    private static Random rand = new Random(47);

    public StoryCharactersGenerator(){}

    private int size = 0;

    public StoryCharactersGenerator(int sz){
        this.size = sz;
    }

    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters) types[rand.nextInt(types.length)].newInstance();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<StoryCharacters> iterator() {
        return null;
    }

    class StoryCharactersIterator implements Iterator<StoryCharacters>{

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public StoryCharacters next() {
            count--;
            return StoryCharactersGenerator.this.next();
        }


        public Iterator<StoryCharacters> iterator() {
            return new StoryCharactersIterator();
        }
    }

    public static void main(String[] args) {
        StoryCharactersGenerator scg = new StoryCharactersGenerator();
        for(int i = 0; i < 5; i++)
            System.out.println(scg.next());
        System.out.println();

        for(StoryCharacters c : new StoryCharactersGenerator(10))
            System.out.println(c);
    }
}
