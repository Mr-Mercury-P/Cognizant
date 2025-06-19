public class Main {
    public static void main(String[] args) {
        Notifier obj1 = new EmailNotifier();
        Notifier obj2 = new SMSNotifierDecorator(obj1);
        Notifier obj3 = new SlackNotifierDecorator(obj2);
        obj3.send();
    }
}