package chapter14.typeInfo.task14;

import java.util.ArrayList;

public class AddUniqueFactory {

    static class FactoryAdd extends ArrayList<Part> {
        public void addFactory(Part type) {
            add(type);
        }
    }

    public static void addFactory(FactoryCreator creator){
        FactoryAdd factoryAdd = new FactoryAdd();
        for (Part part : creator.createArray(20
        )){
            factoryAdd.addFactory(part);
        }
        System.out.println(factoryAdd);
    }


    public static void main(String[] args) {
        addFactory(new ForNameCreator());
    }
}
