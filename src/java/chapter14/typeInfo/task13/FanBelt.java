package chapter14.typeInfo.task13;

public class FanBelt extends Belt {
    public static class Factory implements chapter14.typeInfo.task13.Factory<FanBelt> {
        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
