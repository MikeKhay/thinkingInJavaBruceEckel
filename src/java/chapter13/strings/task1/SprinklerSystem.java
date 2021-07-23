package chapter13.strings.task1;

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString(){
        return
                        "valve1 = " + valve1 + " " +
                        "valve2 = " + valve2 + " " +
                        "valve3 = " + valve3 + " " +
                        "valve4 = " + valve4 + "\n" +
                        "i = " + i + " " + "f = " + f + " " +
                        "source = " + source;
    }
    private String toStringV2() {
        StringBuilder result = new StringBuilder();
        String[] arrayString = {" ", valve1, valve2, valve3, valve4};
        for (int i = 1; i < 5 ; i++){
            result.append(" valve" + i + " = ");
            result.append(arrayString[i]);
        }
        result.append(" i = " + i + " " + "f = " + f + " " + "source = " + source);


        return result.toString();
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
        System.out.println("-----------------------------------");
        System.out.println(sprinklerSystem.toStringV2());

    }
}
