public class SlackNotifierDecorator extends NotifierDecorator{
    SlackNotifierDecorator(Notifier obj)
    {
        super(obj);
    }
    @Override
    public void send() {
        super.send();
        System.out.println("Sending Slack Notification");
    }
}
