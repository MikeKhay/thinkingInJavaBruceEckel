package chapter10.innerClasses.task6.package3;

import chapter10.innerClasses.task6.package2.Outer;
import chapter10.innerClasses.task6.package1Interface.InterWithOneMethod;

public class GetObjectInterface extends Outer{
    public InterWithOneMethod getInterWithOneMethod(String text){
        return new Inner(text);
    }

    public static void main(String[] args) {

        GetObjectInterface getObjectInterface = new GetObjectInterface();
        InterWithOneMethod interWithOneMethod = getObjectInterface.getInterWithOneMethod("Hello!!!!!");
        interWithOneMethod.getText();
    }
}
