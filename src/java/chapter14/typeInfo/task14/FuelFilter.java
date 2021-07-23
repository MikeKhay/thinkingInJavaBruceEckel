package chapter14.typeInfo.task14;

public class FuelFilter extends Filter {
    public static class Factory implements chapter14.typeInfo.task14.Factory<FuelFilter> {

        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
