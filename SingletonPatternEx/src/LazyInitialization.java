public class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization() {}

    public static LazyInitialization getInstance() {
        if(instance == null) {
            instance = new LazyInitialization();
        }
        System.out.println("Lazy instance initialized");
        return instance;
    }
}
