public class StaticBlockInitialization {
    private static StaticBlockInitialization instance;

    private StaticBlockInitialization() {}

    static  {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new Error("Create Instance failed: " + e.getMessage());
        }
    }

    public static StaticBlockInitialization getInstance() {
        return instance;
    }
}
