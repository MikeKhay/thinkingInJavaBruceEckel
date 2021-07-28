package chapter15.generics.task1;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types = new ArrayList<>();

    private static String[] typeNames = {
            "chapter14.typeInfo.task11.Mutt",
            "chapter14.typeInfo.task11.Pug",
            "chapter14.typeInfo.task11.EgyptianMau",
            "chapter14.typeInfo.task11.Manx",
            "chapter14.typeInfo.task11.Cymric",
            "chapter14.typeInfo.task11.Rat",
            "chapter14.typeInfo.task11.Mouse",
            "chapter14.typeInfo.task11.Hamster",
            "chapter14.typeInfo.task11.Gerbil",
    };

    @SuppressWarnings("unchecked")
    private static void loader(){
        try{
            for(String name : typeNames)
                types.add((Class<? extends Pet>)Class.forName(name));
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    static {loader();}

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
