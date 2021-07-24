package chapter14.typeInfo.task24;

public class PowerSteeringBelt extends Belt {
    public static class Factory implements chapter14.typeInfo.task24.Factory<PowerSteeringBelt> {
        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
