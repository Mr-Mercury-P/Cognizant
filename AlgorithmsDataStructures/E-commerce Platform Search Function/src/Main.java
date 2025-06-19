import java.util.*;
public class Main {
    public static Product linearSearch(Product[] products, int targetId)
    {
        for(Product p : products)
        {
            if(p.productId == targetId)
            {
                return p;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, int targetId)
    {
        int left = 0, right = products.length - 1;
        while (left <= right)
        {
            int mid = (left + right) / 2;
            if (products[mid].productId == targetId)
            {
                return products[mid];
            }
            else if (products[mid].productId < targetId)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
                new Product(3, "Phone", "Electronics"),
                new Product(1, "Book", "Education"),
                new Product(2, "Shirt", "Clothing")
        };
        Product p = linearSearch(products, 2);
        if(p != null)
            System.out.println("Linear Search Found: " + p.productName);
        else
            System.out.println("Linear Search: Not Found");

        Arrays.sort(products, (a, b) -> a.productId - b.productId);

        Product pp = binarySearch(products, 3);
        if(pp != null)
            System.out.println("Binary Search Found: " + pp.productName);
        else
            System.out.println("Binary Search: Not Found");
    }
}
