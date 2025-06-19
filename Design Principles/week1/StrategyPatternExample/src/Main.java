public class Main {
    public static void main(String[] args) {
        PaymentContext obj1 = new PaymentContext();
        obj1.setPaymentStrategy(new CreditCardPayment());
        obj1.process();
        obj1.setPaymentStrategy(new PayPalPayment());
        obj1.process();
    }
}