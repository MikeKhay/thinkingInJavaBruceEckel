package chapter14.typeInfo.task24;

public class Factories {

    public static final FactoryCreator creator = new LiteralFactoryCreator();

    public static Part randomPart(){
        return creator.randomPart();
    }

    public static Part[] createArray(int size){
        return creator.createArray(size);
    }
}
