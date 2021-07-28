package chapter15.generics.task2;

public class ControlHoldVehicle {
    public static void main(String[] args) {
        HoldVehicle<Vehicle> holdVehicle = new HoldVehicle();

        holdVehicle.setBicycle(new Bicycle());
        holdVehicle.setCar(new Car());
        holdVehicle.setTrain(new Train());

        System.out.println(holdVehicle.getBicycle());
        System.out.println(holdVehicle.getCar());
        System.out.println(holdVehicle.getTrain());

        holdVehicle.toString();

    }
}
