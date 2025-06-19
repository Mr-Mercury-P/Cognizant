public class RealImage implements Image
{
    private String str;
    public RealImage(String str)
    {
        this.str = str;
    }

    //some methods

    @Override
    public void display() {
        System.out.println("Real Image " + str);
    }
}
