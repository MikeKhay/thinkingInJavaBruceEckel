package chapter14.typeInfo.task13;

public class OilFilter extends Filter {
    public static class Factory implements chapter14.typeInfo.task13.Factory<OilFilter> {
        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}
