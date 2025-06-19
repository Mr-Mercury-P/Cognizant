public class SMSNotifierDecorator extends NotifierDecorator{
    public SMSNotifierDecorator(Notifier obj)
    {
        super(obj);
    }
    @Override
    public void send() {
        super.send();
        System.out.println("Sending SMS notification");
    }
}
