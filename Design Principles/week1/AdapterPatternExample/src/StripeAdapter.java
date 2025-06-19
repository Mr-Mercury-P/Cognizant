public class StripeAdapter implements PaymentProcessor{
    private Stripe obj = new Stripe();

    @Override
    public void processPayment(double amount) {
        obj.makePayment(amount);
    }
}
