package chapter14.typeInfo.task24;

public class NullObject extends Belt {
    public static class Factory implements chapter14.typeInfo.task24.Factory<NullObject> {
        @Override
        public NullObject create() {
            return new NullObject();
        }
    }
}
