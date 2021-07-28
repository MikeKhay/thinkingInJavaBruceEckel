package chapter15.generics.task19;

import java.util.ArrayList;

public class ContainerShip extends ArrayList<Aisle> {

    public ContainerShip(int nAisle, int nFloor, int nContainer){
        for(int i = 0; i < nAisle; i++)
            add(new Aisle(nFloor, nContainer));
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Aisle a : this)
            for(Floor s : a)
                for(Container c : s){
                    result.append(c);
                    result.append("\n");
                }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ContainerShip(5,3,8));
    }
}
