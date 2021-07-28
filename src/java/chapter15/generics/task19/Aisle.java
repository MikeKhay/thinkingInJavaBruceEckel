package chapter15.generics.task19;

import java.util.ArrayList;

public class Aisle extends ArrayList<Floor> {
    public Aisle(int nFloors, int nProducts){
        for(int i = 0; i < nFloors; i++){
            add(new Floor(nProducts));
        }
    }
}
