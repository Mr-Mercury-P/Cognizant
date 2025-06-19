public class NotifierDecorator implements Notifier{
        protected Notifier obj;
        public NotifierDecorator(Notifier obj)
        {
            this.obj = obj;
        }
        public void send()
        {
            obj.send();
        }
}
