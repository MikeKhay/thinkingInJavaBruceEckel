package chapter12.task17;

public class Description {
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Create Description " + s);
    }
    protected void dispose(){
        System.out.println("Finished Description " + s);
    }
}
