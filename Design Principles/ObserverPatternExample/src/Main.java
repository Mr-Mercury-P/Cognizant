import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        StockMarket obj = new StockMarket();
        Observer mob = new MobileApp();
        obj.register(mob);
        Observer web = new WebApp();
        obj.register(web);
        obj.setStockData("Gold", 10000);
        obj.setStockData("silver", 1000);
        obj.setStockData("petrol", 100);
    }
}