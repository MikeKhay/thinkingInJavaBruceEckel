package chapter7.reusing.task20;

public class OverridingPrivate extends WithFinals {

    //    @Override
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }

//    @Override
    private void g(){
        System.out.println("OverridingPrivate.f()");
    }


}
