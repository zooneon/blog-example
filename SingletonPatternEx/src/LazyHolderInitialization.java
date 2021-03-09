public class LazyHolderInitialization {
    private LazyHolderInitialization() {}

    private static class LazyHolder {
        public static final LazyHolderInitialization instance = new LazyHolderInitialization();
    }

    public static LazyHolderInitialization getInstance() {
        return LazyHolder.instance;
    }
}
