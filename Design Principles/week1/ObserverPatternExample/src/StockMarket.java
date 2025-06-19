import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock
{
    private List<Observer> al = new ArrayList<>();
    public void setStockData(String stock, double price) {
        this.stock = stock;
        this.price = price;
        notifyObservers();
    }
    private String stock;
    private double price;
    @Override
    public void register(Observer o) {
        al.add(o);
    }

    @Override
    public void deregister(Observer o) {
        al.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : al)
        {
            o.update(stock, price);
        }
    }
}
