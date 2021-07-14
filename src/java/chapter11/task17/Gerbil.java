package chapter11.task17;

public class Gerbil {
    private String gerbilName;

    public Gerbil(String gerbilName) {
        this.gerbilName = gerbilName;
    }

    public void hop(){
        System.out.println("GerbilName : " + gerbilName);
        System.out.println("It is Gerbil!!!");
    }
}
