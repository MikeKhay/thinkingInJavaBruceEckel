package chapter15.generics.task19;

import java.util.ArrayList;

public class Floor extends ArrayList<Container> {
    public Floor(int nContainer){
        Generators.fill(this, Container.generator, nContainer);
    }
}
