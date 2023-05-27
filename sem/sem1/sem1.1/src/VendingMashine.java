import java.util.LinkedList;

public class VendingMashine {
    private LinkedList<Product> product;
    public VendingMashine(){
        this.product = new LinkedList<>();
    }
    public void putProduct(LinkedList<Product> item){
        this.product = item;
    }
    public Product getProduct(){
        return this.product.getLast();
    }

    @Override
    public String toString() {
        return "VendingMashine{" +
                "product=" + product +
                '}';
    }
}
