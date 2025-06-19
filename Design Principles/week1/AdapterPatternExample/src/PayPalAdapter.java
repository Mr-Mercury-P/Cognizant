public class PayPalAdapter implements PaymentProcessor{
    private PayPal obj = new PayPal();

    @Override
    public void processPayment(double amount) {
        obj.processPayment(amount);
    }
}
