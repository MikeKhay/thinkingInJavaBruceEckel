package chapter14.typeInfo.task15;

public class Pets {
    public static void main(String[] args){
        for (int i = 0; i < 20; i++)
            System.out.println(Pet.createRandom());
    }
}
