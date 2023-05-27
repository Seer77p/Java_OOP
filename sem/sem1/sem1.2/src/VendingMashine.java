import java.util.LinkedList;

public interface VendingMashine {
    public void putProduct(LinkedList<Product> item);

    public  Product getProduct();
}
