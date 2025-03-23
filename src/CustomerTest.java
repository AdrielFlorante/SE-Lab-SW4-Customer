public class CustomerTest {
    public static void main(String[] args) {
        Customer student = new Customer("Prune", new StudentDiscount());
        Customer senior = new Customer("John", new SeniorDiscount());
        Customer veteran = new Customer("Ramon", new VeteranDiscount());

        double amount = 100.0;

        System.out.println("Student " + student.getName() + " will pay: " + student.applyDiscount(amount));
        System.out.println("Senior " + senior.getName() + " will pay: " + senior.applyDiscount(amount));
        System.out.println("Veteran " + veteran.getName() + " will pay: " + veteran.applyDiscount(amount));
    }
}
