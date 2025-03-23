public class StudentDiscount implements Discounts {
    @Override
    public double calculateDiscount(double amount) {
        return 0.10;
    }
}
