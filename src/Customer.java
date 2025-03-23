public class Customer {
    private String name;
    // private String type; // "Student", "Senior Citizen", or "Regular"
    private Discounts discounts; // Instantiate Discounts with Customer

    public Customer(String name, Discounts discount) {
        this.name = name;
        this.discounts = discount;
    }

    public double applyDiscount(double amount) {
        return amount - discounts.calculateDiscount(amount);
    }

    public String getName() {
        return name;
    }
}
