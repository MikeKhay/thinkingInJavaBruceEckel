package chapter8.task17;

public class Stage {

    private StarsShip starsShip = new StarsShip();

    public void stand(){
        starsShip = new AlertStatusStand();
    }

    public void fly(){
        starsShip = new AlertStatusFly();
    }

    public void refuel(){
        starsShip = new AlertStatusRefuel();
    }

    public void viewStatus(){ starsShip.whatDo();}
}
