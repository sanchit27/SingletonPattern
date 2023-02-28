public class PizzaLogger {
    private static PizzaLogger instance;
    private String log = "";

    private PizzaLogger() {}

    public static synchronized PizzaLogger getInstance() {
        if (instance == null) {
            instance = new PizzaLogger();
        }
        return instance;
    }

    public void log(String message) {
        log += message + "\n";
    }

    public String getLog() {
        return log;
    }
}