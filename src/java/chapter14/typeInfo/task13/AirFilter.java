package chapter14.typeInfo.task13;

public class AirFilter extends Filter{
    public static class Factory implements chapter14.typeInfo.task13.Factory<AirFilter> {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
