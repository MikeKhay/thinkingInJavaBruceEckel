package chapter10.innerClasses.task9;

public class OutsideClass {

    private class InsideClass implements InterfaceWithOneMethod{
        private String s;

        public InsideClass(String s) {
            this.s = s;
        }

        @Override
        public String sayText() {
            return s;
        }
    }

    public InterfaceWithOneMethod getReferInterfaceWithOneMethod(String s){
        return new InsideClass(s);

    }

    public static void main(String[] args) {

        OutsideClass outsideClass = new OutsideClass();
        InterfaceWithOneMethod interfaceWithOneMethod = outsideClass.getReferInterfaceWithOneMethod("I am Mike");
        interfaceWithOneMethod.sayText();
    }
}
