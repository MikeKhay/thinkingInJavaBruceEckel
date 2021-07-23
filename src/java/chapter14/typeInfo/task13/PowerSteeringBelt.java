package chapter14.typeInfo.task13;

public class PowerSteeringBelt extends Belt {
    public static class Factory implements chapter14.typeInfo.task13.Factory<PowerSteeringBelt> {
        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
