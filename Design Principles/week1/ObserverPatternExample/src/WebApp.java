public class WebApp implements Observer
{

    @Override
    public void update(String str, double price) {
        System.out.println(str + " " + price);
    }
}
