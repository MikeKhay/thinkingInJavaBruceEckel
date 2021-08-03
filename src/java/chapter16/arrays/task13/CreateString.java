package chapter16.arrays.task13;

public class CreateString {
    public static void main(String[] args) {
        CountingGenerator.Character genC = new CountingGenerator.Character();

        char[] c = new char[10];

        for (int i = 0; i < c.length; i++){
            c[i] = genC.next();
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int j = 0; j < c.length; j++){
            stringBuilder.append(c[j]);
        }

        String s = String.valueOf(stringBuilder);

        System.out.println(s);
    }
}
