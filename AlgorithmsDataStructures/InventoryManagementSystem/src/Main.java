import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Product> hm = new HashMap<>();

        Product p1 = new Product().setProductId("A1").setProductName("Laptop").setPrice(50000).setQuantity(10);
        hm.put(p1.getProductId(), p1);
        System.out.println("After Inserting : "+hm);
        hm.remove("A1");
        System.out.println("After Deleting : "+hm);
    }
}