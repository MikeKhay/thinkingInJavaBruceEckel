package chapter15.generics.task16;


import static chapter15.generics.task16.Tuple.tuple;

public class TupleTest {

    static TwoTuple<String, Integer> f(){
        return tuple("hi", 47);
    }

    static TwoTuple f2(){
        return tuple("hi", 48);
    }

    static ThreeTuple<Amphibian, String, Integer> g(){
        return tuple(new Amphibian(), "hi", 49);
    }

    static FourTuple<Double, Amphibian, String, Integer> h(){
        return tuple(1.0, new Amphibian(), "hi", 50);
    }

    static FiveTuple<Character, Double, Amphibian, String, Integer> k(){
        return tuple('x', 2.005, new Amphibian(), "hi", 51);
    }

    static SixTuple<Long, Character, Double, Amphibian, String, Integer> r(){
        return tuple(32834234l, 'q', 4.3422, new Amphibian(), "hi", 52);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> t = f();
        System.out.println(t);

        TwoTuple<String, Integer> t2 = f2();
        System.out.println(t2);

        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(r());
    }
}
