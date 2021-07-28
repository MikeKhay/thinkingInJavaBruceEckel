package chapter15.generics.task2;

public class HoldVehicle<T> {
    private T car;
    private T bicycle;
    private T train;

    public void setCar(T car){
        this.car = car;
    }
    public void setBicycle(T bicycle){
        this.bicycle = bicycle;
    }
    public void setTrain(T train){
        this.train = train;
    }
    public T getCar(){
        return car;
    }
    public T getBicycle(){
        return bicycle;
    }
    public T getTrain(){
        return train;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "car=" + car +
                ", bicycle=" + bicycle +
                ", train=" + train +
                '}';
    }
}
