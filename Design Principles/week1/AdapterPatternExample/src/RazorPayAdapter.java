public class RazorPayAdapter implements PaymentProcessor{
    private RazorPay obj = new RazorPay();

    @Override
    public void processPayment(double amount) {
        obj.doPayment(amount);
    }
}
