package chapter15.generics.task26;

public class CovariantArrays {
    public static void main(String[] args) {
        Number[] numbers = new Integer[10];
//        numbers[0] = new Integer(7);
//        numbers[1] = new Long(12l);

        try{
            numbers[0] = new Integer(27);
        } catch (Exception e){
            System.out.println(e);
        }

        try {
            numbers[0] = new Long(22l);
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
