package chapter7.task15;

public class MethodProtectedExtends extends MethodProtected {

    MethodProtected methodProtected = new MethodProtected();

    @Override
    protected void methodProtected() {
        super.methodProtected();
    }

    public void methodProtectedExtends(){
        methodProtected.methodProtected();
    }

}
