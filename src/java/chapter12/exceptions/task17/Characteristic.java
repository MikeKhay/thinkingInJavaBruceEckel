package chapter12.exceptions.task17;

public class Characteristic {
    private String s;
    Characteristic(String s){
        this.s = s;
        System.out.println("Create Characteristic " + s );
    }

    protected void dispose(){
        System.out.println("Finished Characteristic " + s );
    }
}
