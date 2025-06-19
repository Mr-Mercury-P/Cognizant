public class Main {
    public static void main(String[] args) {
        PaymentProcessor obj1 = new PayPalAdapter();
        obj1.processPayment(1000.9);
        PaymentProcessor obj2 = new RazorPayAdapter();
        obj2.processPayment(100.90);
        PaymentProcessor obj3 = new StripeAdapter();
        obj3.processPayment(10000.90);
    }
}