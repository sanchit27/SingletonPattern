public class App {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Pepperoni", "Large");
        Pizza pizza2 = new Pizza("Mushroom", "Medium");

        PizzaLogger logger = PizzaLogger.getInstance();
        System.out.println(logger.getLog());
    }
}
