public class PaymentContext {
    private PaymentStrategy obj;
    public void setPaymentStrategy(PaymentStrategy obj)
    {
        this.obj = obj;
    }
    public void process()
    {
        if(obj == null) System.out.println("initiate strategy");
        obj.pay();
    }
}
