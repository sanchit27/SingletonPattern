public class Pizza {
    private String type;
    private String size;

    public Pizza(String type, String size) {
        this.type = type;
        this.size = size;
        PizzaLogger.getInstance().log("New " + size + " " + type + " pizza created.");
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }
}
