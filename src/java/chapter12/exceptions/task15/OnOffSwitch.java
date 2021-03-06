package chapter12.exceptions.task15;

public class OnOffSwitch {
    static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {
    }

    public static void main(String[] args) {
        try{
            sw.on();
            OnOffSwitch.f();
            throw new RuntimeException();
        } catch (OnOffException1 e){
            System.out.println("OnOffException1");
        } catch (OnOffException2 e){
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}
