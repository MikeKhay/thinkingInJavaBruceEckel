package chapter15.generics.task25;

public class EpicBattle {
    static <T extends SuperHearing> void useSuperHearing(T t){
        t.hearSubtleNoises();
    }

    static <T extends XRayVision> void useXRayVision(T t){
        t.seeThroughWalls();
    }

    public static void main(String[] args) {
        useSuperHearing(new SuperHero());

        useXRayVision(new SuperHero());
    }
}
