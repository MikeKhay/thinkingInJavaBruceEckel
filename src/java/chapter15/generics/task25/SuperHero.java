package chapter15.generics.task25;

public class SuperHero implements XRayVision, SuperHearing {

    @Override
    public void seeThroughWalls() {
        System.out.println("I am see ThroughWalls.");
    }

    @Override
    public void hearSubtleNoises() {
        System.out.println("I am hear subtle noise.");
    }
}
