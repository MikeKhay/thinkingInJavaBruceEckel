package chapter15.generics.task15;


import static chapter15.generics.task15.Tuple.tuple;

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

    public static void main(String[] args) {
        TwoTuple<String, Integer> t = f();
        System.out.println(t);

        TwoTuple<String, Integer> t2 = f2();
        System.out.println(t2);

        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
