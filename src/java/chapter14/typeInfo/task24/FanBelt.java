package chapter14.typeInfo.task24;

public class FanBelt extends Belt {
    public static class Factory implements chapter14.typeInfo.task24.Factory<FanBelt> {
        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
