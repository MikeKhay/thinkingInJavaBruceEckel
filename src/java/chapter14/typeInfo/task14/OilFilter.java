package chapter14.typeInfo.task14;

public class OilFilter extends Filter {
    public static class Factory implements chapter14.typeInfo.task14.Factory<OilFilter> {
        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}
