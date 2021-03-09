public class GeneralInitialization {
    private static GeneralInitialization instance = new GeneralInitialization();

    private GeneralInitialization() {}

    public static GeneralInitialization getInstance() {
        System.out.println("General instance initialized");
        return instance;
    }
}
