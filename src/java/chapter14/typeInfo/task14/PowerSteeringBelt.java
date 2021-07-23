package chapter14.typeInfo.task14;

public class PowerSteeringBelt extends Belt {
    public static class Factory implements chapter14.typeInfo.task14.Factory<PowerSteeringBelt> {
        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
