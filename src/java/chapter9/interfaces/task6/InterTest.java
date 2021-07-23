package chapter9.interfaces.task6;

class InterTest implements InterWithMethod
{

    @Override
    public void sayHello() {
        System.out.println("Say Hello");
    }

    @Override
    public void sayGoodBy() {
        System.out.println("Say Good By");

    }

    @Override
//    private
    public
    void sayGoodLook() {
        System.out.println("Say Good Look");

    }
}
