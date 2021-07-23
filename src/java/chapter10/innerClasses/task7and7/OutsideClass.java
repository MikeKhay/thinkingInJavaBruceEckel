package chapter10.innerClasses.task7and7;

public class OutsideClass {
    public InterfaceWithOneMethod getReferInterfaceWithOneMethod(){
        class InsideClass implements InterfaceWithOneMethod{

            @Override
            public void sayHello() {
                System.out.println("It is InterfaceWithOneMethod");
            }
        }
        return new InsideClass();
    }

    public static void main(String[] args) {
        OutsideClass outsideClass = new OutsideClass();
        InterfaceWithOneMethod i = outsideClass.getReferInterfaceWithOneMethod();
    }
}
