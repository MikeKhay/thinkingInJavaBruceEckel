package chapter14.typeInfo.task14;

public class CabinAirFilter extends Filter {
    public static class Factory implements chapter14.typeInfo.task14.Factory<CabinAirFilter> {
        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}
