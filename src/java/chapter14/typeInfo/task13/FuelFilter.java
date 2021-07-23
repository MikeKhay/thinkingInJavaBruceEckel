package chapter14.typeInfo.task13;

public class FuelFilter extends Filter {
    public static class Factory implements chapter14.typeInfo.task13.Factory<FuelFilter> {

        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
