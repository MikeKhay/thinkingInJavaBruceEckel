package chapter15.generics.task3;

public class TestSixTuple {
    static SixTuple<People,Integer,String,Animal,Double,Character> a(){
        return new SixTuple<>(new People(),1247,"Hello", new Animal(), 3.17,'s');
    }

    public static void main(String[] args) {
        SixTuple<People,Integer,String,Animal,Double,Character> s = a();
        System.out.println(s);
    }
}
