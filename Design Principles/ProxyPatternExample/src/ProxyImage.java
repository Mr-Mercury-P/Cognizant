public class ProxyImage implements Image
{
    private RealImage obj;
    private String str;
    public ProxyImage(String str)
    {
        this.str = str;
    }
    @Override
    public void display() {
        if(obj == null) obj = new RealImage(str);
        obj.display();
    }
}
