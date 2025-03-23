public class VeteranDiscount implements Discounts {
    @Override
    public double calculateDiscount(double amount) {
        return 0.25;
    }
}
