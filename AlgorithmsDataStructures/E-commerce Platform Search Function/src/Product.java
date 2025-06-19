public class Product {
    private String productId, productName;
    private long quantity, price;
    public Product(String productId, String productName, long quantity, long price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public Product() {

    }

    public long getPrice() {
        return price;
    }
    public Product setPrice(long price) {
        this.price = price;
        return this;
    }

    public String getProductId() {
        return productId;
    }
    public Product setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductName() {
        return productName;
    }

    public Product setProductName(String productName) {
        this.productName = productName;
        return this;
    }


    public long getQuantity() {
        return quantity;
    }

    public Product setQuantity(long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Product build()
    {
        return new Product(productId, productName, quantity, price);
    }
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

}
